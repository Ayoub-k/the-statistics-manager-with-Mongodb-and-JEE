package Beans;

//public class Pay {
//
//}

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Date", "Country", "Confirmed", "Recovered", "Deaths" })
public class Pay {

	@JsonProperty("Date")
	private String date;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Confirmed")
	private Integer confirmed;
	@JsonProperty("Recovered")
	private Integer recovered;
	@JsonProperty("Deaths")
	private Integer deaths;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Pay() {
	}

	/**
	 *
	 * @param date
	 * @param country
	 * @param recovered
	 * @param confirmed
	 * @param deaths
	 */
	public Pay(String date, String country, Integer confirmed, Integer recovered, Integer deaths) {
		super();
		this.date = date;
		this.country = country;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
	}

	@JsonProperty("Date")
	public String getDate() {
		return date;
	}

	@JsonProperty("Date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("Country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("Country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("Confirmed")
	public Integer getConfirmed() {
		return confirmed;
	}

	@JsonProperty("Confirmed")
	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}

	@JsonProperty("Recovered")
	public Integer getRecovered() {
		return recovered;
	}

	@JsonProperty("Recovered")
	public void setRecovered(Integer recovered) {
		this.recovered = recovered;
	}

	@JsonProperty("Deaths")
	public Integer getDeaths() {
		return deaths;
	}

	@JsonProperty("Deaths")
	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

}