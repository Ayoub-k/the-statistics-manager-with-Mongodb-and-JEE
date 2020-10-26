
package Mongo.DAO;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.push;
import static com.mongodb.client.model.Updates.set;
import static java.util.Arrays.asList;

import java.io.FileInputStream;
import java.io.FileWriter;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;

import Beans.Admin;
import Beans.Continent;
import Beans.Pay;

public class DBinteraction {

	public static void ajouterContinent(Continent Cont) {

		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");

		Document continent = new Document("_id", new ObjectId());
		continent.append("nom", Cont.getNom())
				.append("nbrCasInfectes", Cont.getNbrCasInfectes())
				.append("nbrCasGueries", Cont.getNbrCasGueries())
				.append("tauxMortalite", Cont.getTauxMortalite());

		for (int i = 0; i < Cont.getPays().size(); i++) {
			Document pays = new Document();
			pays.append("Date", Cont.getPays().get(i).getDate());
			pays.append("Country", Cont.getPays().get(i).getCountry());
			pays.append("Confirmed", Cont.getPays().get(i).getConfirmed());
			pays.append("Recovered", Cont.getPays().get(i).getRecovered());
			pays.append("Deaths", Cont.getPays().get(i).getDeaths());
			continent.append("pays", asList(pays));
		}
		collection.insertOne(continent);
		System.out.println("ok");
	}

	public static void ajouterChamp(String NomContinent,String Camp) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		Bson filter = eq("nom", NomContinent);
		Bson updateOperation = set(Camp, "sdfghjkjhgfd");
		@SuppressWarnings("unused")
		UpdateResult updateResult = collection.updateOne(filter, updateOperation);
		System.out.println(collection.find(filter).first().toJson());

         System.out.println(updateResult);
	}

	public static void AjouterPays(Pay pays, String NomContinent) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");

		Document documPays = new Document();
		documPays.append("Date", pays.getDate())
				.append("Country", pays.getCountry())
				.append("Confirmed", pays.getConfirmed())
				.append("Recovered", pays.getRecovered())
				.append("Deaths", pays.getDeaths());

		Bson filter = eq("nom", NomContinent);
		Bson updateOperation = push("pays", documPays);
		UpdateOptions options = new UpdateOptions().upsert(true);
		Bson updateResult = (Bson) collection.findOneAndUpdate(filter, updateOperation);

	}

	public static void update_cas_infe(String NomContinent, int nbrCasInfectes) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		collection.updateOne(new Document("nom", NomContinent),
				new Document("$set", new Document("nbrCasInfectes", nbrCasInfectes)));
	}

	public static void update_cas_gure(String NomContinent, int nbrCasGueries) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		collection.updateOne(new Document("nom", NomContinent),
				new Document("$set", new Document("nbrCasGueries", nbrCasGueries)));
	}

	public static void update_taux(String NomContinent, int nbr_cas_inf) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		collection.updateOne(new Document("nom", NomContinent),
				new Document("$set", new Document("tauxMortalite", nbr_cas_inf)));
	}

	public static Continent lireContinent(String NomContinent) {

		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		Document continent = collection.find(new Document("nom", NomContinent)).first();

//		System.out.println("---------------------fffrf--------------------------------------------------");

//		projection
		//		List<Document> docs = collection.find(eq("nom", NomContinent)).projection(fields(excludeId(), include("Pays")))
		//				.into(new ArrayList<>());
		
		String jso=continent.toJson();
		ObjectMapper mapper=new ObjectMapper();
		Continent continent1=null;
		try {
		FileWriter file=new FileWriter("json.json");
		file.write(jso);
		file.close();
		
		FileInputStream fileInputStream = new FileInputStream("json.json");
		continent1 = mapper.readValue(fileInputStream, Continent.class);
		}catch(Exception e) {
			e.printStackTrace();
		}

		return continent1;
	}
	
	public static int islogin(String Email,String Pass) {
		
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		Document doc = collection.find(new Document("Email", Email)).first();
		
		String jso=doc.toJson();
		ObjectMapper mapper=new ObjectMapper();
		@SuppressWarnings("unused")
		Admin admin2=null;
		try {
		FileWriter file=new FileWriter("admin.json");
		file.write(jso);
		file.close();
		
		FileInputStream fileInputStream = new FileInputStream("admin.json");
		admin2 = mapper.readValue(fileInputStream, Admin.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(Email.equals(admin2.getEmail()) && Pass.equals(admin2.getPassword()))
			return 1;
		
		return 0;
	}


	public static void ajouterAdmin(Admin admin) {
		
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");

		Document continent = new Document("_id", new ObjectId());
		continent.append("FirstName",admin.getFirstName())
				.append("LastName", admin.getLastName())
				.append("Email", admin.getEmail())
				.append("Password",admin.getPassword())
				.append("Phone", admin.getPhone());
		collection.insertOne(continent);
		System.out.println("ok");
	}
	
	public static Admin GetAdmin(String Email,String Pass) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("Covid19");
		Document doc = collection.find(new Document("Email", Email)).first();
		
		String jso=doc.toJson();
		ObjectMapper mapper=new ObjectMapper();
		@SuppressWarnings("unused")
		Admin admin2=null;
		try {
		FileWriter file=new FileWriter("admin.json");
		file.write(jso);
		file.close();
		
		FileInputStream fileInputStream = new FileInputStream("admin.json");
		admin2 = mapper.readValue(fileInputStream, Admin.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(Email.equals(admin2.getEmail()) && Pass.equals(admin2.getPassword()))
			return admin2;
		
		return null;
	}

	
	
	
	public static void SupprimerContinent(String NomContinent) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("testMongo");
		MongoCollection<Document> collection = database.getCollection("test");
		collection.deleteOne(Filters.eq("nom", NomContinent));
	}

}
