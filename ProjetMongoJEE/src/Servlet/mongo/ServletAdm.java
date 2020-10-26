package Servlet.mongo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Admin;
import Mongo.DAO.DBinteraction;

/**
 * Servlet implementation class ServletAdm
 */
@WebServlet("/ServletAdm")
public class ServletAdm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAdm() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		modifier cas insfetc cont
		String ContinentCI=request.getParameter("ContinentCI");
		int nbrCasInfectesCI=Integer.parseInt(request.getParameter("nbrCasInfectesCI"));
		
		if(ContinentCI!="") {
			DBinteraction.update_cas_infe(ContinentCI, nbrCasInfectesCI);
			request.getRequestDispatcher("/Admin.jsp?test=ok").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
// ajouter admin
		String nomA=request.getParameter("nomA");
		String prenom=request.getParameter("prenom");
		String nombre=request.getParameter("nombre");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
//		String firstName, String lastName, String email, String password, String phon
		Admin admin=new Admin(nomA,prenom,email,password,nombre);
		if(nomA!="" && prenom!="" && nombre!="" && email!="" && password!="") {
			DBinteraction.ajouterAdmin(admin);
			request.getRequestDispatcher("/Admin.jsp?test=ok").forward(request, response);
		}
	}

}
