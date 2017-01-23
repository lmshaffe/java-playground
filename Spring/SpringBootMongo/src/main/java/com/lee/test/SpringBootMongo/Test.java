package com.lee.test.SpringBootMongo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\|{2}|&&|([\\!\\*\\+\\(\\)\\[\\]\\{\\}\\^\\~\\?\\:\\\\\\\"\\-])");
		String s = "calvi!";
		Matcher m = p.matcher(s);
		boolean found = m.find();
		System.out.println(found);
	}
}
