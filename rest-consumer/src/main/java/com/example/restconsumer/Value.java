package com.example.restconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
	private Long id;
	private String quote;
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Value{" +
		        "id=" + id +
		        ", quote='" + quote + '\'' +
		        '}';	}
	
}
