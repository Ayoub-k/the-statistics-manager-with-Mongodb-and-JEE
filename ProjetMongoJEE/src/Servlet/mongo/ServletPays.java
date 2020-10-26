package Servlet.mongo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Continent;
import Beans.Pay;
import Mongo.DAO.DBinteraction;

/**
 * Servlet implementation class ServletPays
 */
@WebServlet("/ServletPays")
public class ServletPays extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPays() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		@SuppressWarnings("unused")
		Continent continent=new Continent();
		String varcontinent= (String)request.getParameter("nomContinent");
		String varPays= (String)request.getParameter("nomPays");
		continent=DBinteraction.lireContinent(varcontinent);
		ArrayList<Pay> newListe=new ArrayList<>();
	
		for (Pay pays : continent.getPays()) {
//			Algeria.lenom()
			 if(varPays.equals(pays.getCountry())) {
				newListe.add(pays);
			}
		}
		
		continent.setPays(newListe);
		request.setAttribute("continent", continent);

		
		int i=continent.getPays().size();
		Pay py= continent.getPays().get(i-1);
		request.setAttribute("statistique", py);
		request.getRequestDispatcher("/satati_pays.jsp").forward(request, response);				
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ContinentSC=request.getParameter("ContinentSC");
		
		DBinteraction.SupprimerContinent(ContinentSC);
		request.getRequestDispatcher("/Admin.jsp").forward(request, response);
	}

}
