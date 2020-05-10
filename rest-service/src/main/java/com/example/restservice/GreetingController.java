package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Resource Controller
 * HTTP requests are handled by a controller
 * @author admin
 * 
 * 
 * http://localhost:8080/greeting?name=Siba
 * {"id":9,"message":"Hey, Siba !! How are you ?"}
 *
 */
@RestController
public class GreetingController {
	private static final String templateMessage = "Hey, %s !! How are you ?";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name" , defaultValue ="Dude") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(templateMessage, name));
	}
}
