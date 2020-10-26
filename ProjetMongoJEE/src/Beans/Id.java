package Beans;

//public class Id {
//
//}

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "$oid" })
public class Id {

	@JsonProperty("$oid")
	private String $oid;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Id() {
	}

	/**
	 *
	 * @param $oid
	 */
	public Id(String $oid) {
		super();
		this.$oid = $oid;
	}

	@JsonProperty("$oid")
	public String get$oid() {
		return $oid;
	}

	@JsonProperty("$oid")
	public void set$oid(String $oid) {
		this.$oid = $oid;
	}

}