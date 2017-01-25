package com.lee.test.SpringBootMongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lee.test.SpringBootMongo.model.TestDocumentObject;

public interface TestDocumentRepository extends MongoRepository<TestDocumentObject, String> {

	public TestDocumentObject findByTitle(String title);
	public TestDocumentObject findById(String id);

}
