package com.example.restconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Domain class to contain the data from webservice
 * @author admin
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	private Value value;
	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;
	
	@Override
	  public String toString() {
	    return "Quote{" +
	        "type='" + type + '\'' +
	        ", value=" + value +
	        '}';
	  }
}
