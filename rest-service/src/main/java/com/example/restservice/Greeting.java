package com.example.restservice;
/**
 * Resource representation class
 * POJO with fields,construtor and accessors
 * @author admin
 *
 */
public class Greeting {
	private final long id;
	private final String message;
	public Greeting(long id, String message) {
		this.id = id;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
}
