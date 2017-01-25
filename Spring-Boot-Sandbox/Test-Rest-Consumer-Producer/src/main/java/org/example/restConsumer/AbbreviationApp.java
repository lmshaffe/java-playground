package org.example.restConsumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AbbreviationApp implements CommandLineRunner {

	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(AbbreviationApp.class);
	}

	@Override
	public void run(String... args) throws Exception {
		String shortForm = "CS";
		URI uri = new URI("https://daxeel-abbreviations-v1.p.mashape.com/all/" + shortForm);
		//headers needed for API key
		HttpHeaders header = createAbbreviationHeader();
		HttpEntity<?> entity = new HttpEntity<Object>(header);
		ResponseEntity<List<Abbreviation>> res = restTemplate.exchange(uri, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Abbreviation>>() {});

		int count = 1;
		for (Abbreviation abb : res.getBody()) {
			System.out.println("Item #" + count + "\n" + abb + "\n");
			count++;
		}
	}

	private HttpHeaders createAbbreviationHeader() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "vHKPz8biStmshwWuIxQfOVR35XL4p155zmbjsnxcD5T34X8HcR");
		return headers;
	}

}
