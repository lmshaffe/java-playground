package com.lee.test.SpringBootMongo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class SpringMongoConfig extends AbstractMongoConfiguration {

	@Autowired
	Environment env;

	//private MongoClientURI mongoURI = new MongoClientURI(env.getProperty("spring.data.mongodb.uri"));

	@Override
	protected String getDatabaseName() {
		return "testDB";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost", 27017);
		//return new MongoClient(mongoURI);
	}

	@Override
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), getDatabaseName());
	}

}
