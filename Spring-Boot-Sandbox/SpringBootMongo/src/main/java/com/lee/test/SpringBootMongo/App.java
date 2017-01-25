package com.lee.test.SpringBootMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lee.test.SpringBootMongo.model.TestDocumentObject;

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	TestDocumentRepository repository;

	public static void main( String[] args )
	{
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//insert
		//repository.save(new TestDocumentObject("Test Title","Test Zone","Test Attribute"));
		for (TestDocumentObject document : repository.findAll()) {
			System.out.println(document);
		}

		System.out.println("\nTitle found: " + repository.findByTitle("Coupon Codes") + "\n");
		System.out.println("ID found: " + repository.findById("56effbd0a3fcdd428de47aab") + "\n");
		//should return null
		System.out.println("ID found: " + repository.findById("Coupon Codes") + "\n");
	}
}


