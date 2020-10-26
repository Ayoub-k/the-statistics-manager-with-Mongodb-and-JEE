package Test;

import java.io.IOException;
import java.util.ArrayList;

import org.bson.json.JsonParseException;

import com.fasterxml.jackson.databind.JsonMappingException;

import Beans.Admin;
import Beans.Continent;
import Beans.Pay;
import Mongo.DAO.DBinteraction;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//		Pay py1=new Pay("le_maroc",5,0,"",100);
//		Pay py2=new Pay("le_maroc",5,0,"",100);
		ArrayList<Pay> list=new ArrayList<>();

//		list.add(py1);list.add(py2);

//		Continent continent=new Continent("Ayo",0,0,0,list);
		
		
//		DBinteraction.ajouterPays(py1, "JAA");
//		DBinteraction.ajouterContinent(continent);
//		DBinteraction.AjouterPays(py1, "Ayo");
//		DBinteraction.update_cas_infe("Ayo",60);
//		System.out.println("--------------------------------------dddd--------------------------------------------------");
//		Continent cnti=DBinteraction.lireContinent("America");
//		System.out.println(cnti.getPays());
		
//		for (Pays pays : cnti.getPays()) {
//			System.out.println(pays.getNom());
//		}

//		Admin admin=new Admin( "Ayoub", "elkhaddouri", "ayoub@elkhad.com", "123456", "06145250");
		
//		DBinteraction.ajouterAdmin(admin);
//		int i=DBinteraction.islogin("ayoub@elkhad.com",  "123456");
//		System.out.println(i);
//        System.out.println(cnti.getPays().get(0).getDate());
	}

}
