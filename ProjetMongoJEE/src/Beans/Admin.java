package Beans;

//public class Admin {
//
//}
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "FirstName", "LastName", "Email", "Password", "Phone" })
public class Admin {

	@JsonProperty("_id")
	private Id id;
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("Email")
	private String email;
	@JsonProperty("Password")
	private String password;
	@JsonProperty("Phone")
	private String phone;

	
	public Admin() {
	}

	/**
	 *
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param phone
	 * @param id
	 * @param email
	 */
	public Admin(String firstName, String lastName, String email, String password, String phone) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	@JsonProperty("_id")
	public Id getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Id id) {
		this.id = id;
	}

	@JsonProperty("FirstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("FirstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("LastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("LastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("Email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("Email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("Password")
	public String getPassword() {
		return password;
	}

	@JsonProperty("Password")
	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty("Phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("Phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

}