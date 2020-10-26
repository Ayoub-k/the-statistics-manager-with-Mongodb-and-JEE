package Servlet.mongo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Mongo.DAO.DBinteraction;

@WebServlet("/ServletAdmi")
public class ServletAdmi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletAdmi() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Modifcation des info dans continent
		String ContinentCG=request.getParameter("ContinentCG");
		int nbrCasGueriesCG=Integer.parseInt(request.getParameter("nbrCasGueriesCG"));
		if(ContinentCG!="") {
			DBinteraction.update_cas_gure(ContinentCG, nbrCasGueriesCG);
			request.getRequestDispatcher("/Admin.jsp?test=ok").forward(request, response);
		}	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ContinentTM=request.getParameter("ContinentTM");
		int tauxMortaliteTM=Integer.parseInt(request.getParameter("tauxMortaliteTM"));
		if(ContinentTM!="") {
			DBinteraction.update_taux(ContinentTM, tauxMortaliteTM);
			request.getRequestDispatcher("/Admin.jsp?test=ok").forward(request, response);
		}
		
		
	}

}
