package com.lee.test.SpringBootMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "LeeTest")
public class TestDocumentObject {

	@Id
	private String id;

	private String title;
	private String zones;
	private String attributes;

	public TestDocumentObject(String title, String zones, String attributes) {
		this.title = title;
		this.zones = zones;
		this.attributes = attributes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getZones() {
		return zones;
	}

	public void setZones(String zones) {
		this.zones = zones;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return String.format("Page[id=%s, title='%s', zones='%s', attributes='%s']", id, title, zones, attributes);
	}






}
