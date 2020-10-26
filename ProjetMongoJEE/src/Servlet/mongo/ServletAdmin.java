package Servlet.mongo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Admin;
import Beans.Continent;
import Beans.Pay;
import Mongo.DAO.DBinteraction;


@WebServlet("/ServletAdmin")
public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletAdmin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Ajouter Continent avec un pays
		String nomC=request.getParameter("Continent");
		int nbrCasInfectes=Integer.parseInt(request.getParameter("nbrCasInfectes"));
		int nbrCasGueries=Integer.parseInt(request.getParameter("nbrCasGueries"));
		int tauxMortalite=Integer.parseInt(request.getParameter("tauxMortalite"));
		String Date=request.getParameter("Date");
		String Country=request.getParameter("Country");
		int Confirmed=Integer.parseInt(request.getParameter("Confirmed"));
		int Recovered=Integer.parseInt(request.getParameter("Recovered"));
		int Deaths=Integer.parseInt(request.getParameter("Deaths"));
		
		Pay pays=new Pay(Date,Country,Confirmed,Recovered,Deaths);
		List<Pay> liste=new ArrayList<>();
		liste.add(pays);
		Continent continent=new Continent(nomC,nbrCasInfectes,nbrCasGueries,tauxMortalite,liste);
		if(nomC!="" &&  Date!="" && Country!="") {
			DBinteraction.ajouterContinent(continent);
			request.getRequestDispatcher("/Admin.jsp?test=ok").forward(request, response);
		}
		
		
		
//	String firstName, String lastName, String email, String password, String phone
		
		
		
		
		
		
		
		
		
		
		
		request.getRequestDispatcher("/Admin.jsp?test=Non").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(email!="" && password!="") {
			int i=DBinteraction.islogin(email, password);
		if(i==1){
			Admin admin=DBinteraction.GetAdmin(email, password);
			if(admin!=null) {
			request.setAttribute("Admin", admin);
			session.setAttribute("connectedAdmin", admin);
			request.getRequestDispatcher("/Admin.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/Acueil.jsp").forward(request, response);
		}
		}
		}else {
			request.getRequestDispatcher("/Acueil.jsp").forward(request, response);
		}
		

	}
}
