package org.example.restConsumer;

public class Abbreviation {

	public Abbreviation() {

	}

	private String fullform;
	private String meaning;

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getFullform() {
		return fullform;
	}

	public void setFullform(String fullform) {
		this.fullform = fullform;
	}

	@Override
	public String toString() {
		return "fullform: " + fullform + "\nmeaning: " + meaning;
	}

}
