package org.example.restProducer;

public enum Gender {
	MALE("male"),
	FEMALE("female"),
	UNKNOWN("unknown");

	private String gender;

	Gender(String gender) {
		this.gender = gender;
	}

}
