package Servlet.mongo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Continent;
import Beans.Pay;
import Mongo.DAO.DBinteraction;


@WebServlet("/ServletContinent")
public class ServletContinent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletContinent() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		@SuppressWarnings("unused")
		Continent continent=new Continent();
		String varcontinent= (String)request.getParameter("nomContinent");
		continent=DBinteraction.lireContinent(varcontinent);
		request.setAttribute("continent", continent);
		request.getRequestDispatcher("/statistique.jsp").forward(request, response);				

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		ajouer pays 
		String ContinentP=request.getParameter("ContinentP");
		String DateP=request.getParameter("DateP");
		String CountryP=request.getParameter("CountryP");
		int ConfirmedP=Integer.parseInt(request.getParameter("ConfirmedP"));
		int RecoveredP=Integer.parseInt(request.getParameter("RecoveredP"));
		int DeathsP=Integer.parseInt(request.getParameter("DeathsP"));
		
		Pay paysP=new Pay(DateP,CountryP,ConfirmedP,RecoveredP,DeathsP);
		if(DateP!="" && CountryP!="" && ContinentP=="") {
			DBinteraction.AjouterPays(paysP, ContinentP);
			request.getRequestDispatcher("/Admin.jsp?test=ok").forward(request, response);
		}
		
		
	}

}
