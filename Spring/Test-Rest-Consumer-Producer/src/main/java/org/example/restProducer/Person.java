package org.example.restProducer;

import java.time.LocalDate;

public class Person {
	private final String name;
	private LocalDate dateOfBirth;
	private Gender gender;


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
