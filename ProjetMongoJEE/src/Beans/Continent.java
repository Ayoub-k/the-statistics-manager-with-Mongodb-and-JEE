package Beans;



import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "nom", "nbrCasInfectes", "nbrCasGueries", "tauxMortalite", "pays" })
public class Continent {

	@JsonProperty("_id")
	private Id id;
	@JsonProperty("nom")
	private String nom;
	@JsonProperty("nbrCasInfectes")
	private Integer nbrCasInfectes;
	@JsonProperty("nbrCasGueries")
	private Integer nbrCasGueries;
	@JsonProperty("tauxMortalite")
	private Integer tauxMortalite;
	@JsonProperty("pays")
	private List<Pay> pays = null;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Continent() {
	}

	/**
	 *
	 * @param tauxMortalite
	 * @param nbrCasInfectes
	 * @param id
	 * @param nbrCasGueries
	 * @param nom
	 * @param pays
	 */
	public Continent(String nom, Integer nbrCasInfectes, Integer nbrCasGueries, Integer tauxMortalite,
			List<Pay> pays) {
		super();
		
		this.nom = nom;
		this.nbrCasInfectes = nbrCasInfectes;
		this.nbrCasGueries = nbrCasGueries;
		this.tauxMortalite = tauxMortalite;
		this.pays = pays;
	}

	@JsonProperty("_id")
	public Id getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Id id) {
		this.id = id;
	}

	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}

	@JsonProperty("nom")
	public void setNom(String nom) {
		this.nom = nom;
	}

	@JsonProperty("nbrCasInfectes")
	public Integer getNbrCasInfectes() {
		return nbrCasInfectes;
	}

	@JsonProperty("nbrCasInfectes")
	public void setNbrCasInfectes(Integer nbrCasInfectes) {
		this.nbrCasInfectes = nbrCasInfectes;
	}

	@JsonProperty("nbrCasGueries")
	public Integer getNbrCasGueries() {
		return nbrCasGueries;
	}

	@JsonProperty("nbrCasGueries")
	public void setNbrCasGueries(Integer nbrCasGueries) {
		this.nbrCasGueries = nbrCasGueries;
	}

	@JsonProperty("tauxMortalite")
	public Integer getTauxMortalite() {
		return tauxMortalite;
	}

	@JsonProperty("tauxMortalite")
	public void setTauxMortalite(Integer tauxMortalite) {
		this.tauxMortalite = tauxMortalite;
	}

	@JsonProperty("pays")
	public List<Pay> getPays() {
		return pays;
	}

	@JsonProperty("pays")
	public void setPays(List<Pay> pays) {
		this.pays = pays;
	}

}