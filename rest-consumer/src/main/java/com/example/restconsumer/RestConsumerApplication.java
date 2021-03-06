package com.example.restconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestConsumerApplication {
	
	private static final Logger log = 
			LoggerFactory.getLogger(RestConsumerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RestConsumerApplication.class, args);
	}
	
	/**
	 * uses the Jackson JSON processing library to process the incoming data.
	 * @param builder
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
		
	}
	
	/**
	 * runs the RestTemplate (and, consequently, fetches our quotation) on startup
	 * @param restTemplate
	 * @return
	 * @throws Exception
	 */
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return arg -> {
			Quote quote = restTemplate.getForObject(
					"https://gturnquist-quoters.cfapps.io/api/random", 
					Quote.class);
			log.info(quote.toString());
		};
	}

}
