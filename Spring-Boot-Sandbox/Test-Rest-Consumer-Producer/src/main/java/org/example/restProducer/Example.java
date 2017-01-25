package org.example.restProducer;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/amber")
	Person amber() {
		Person amber = new Person("Amber");
		amber.setGender(Gender.FEMALE);
		amber.setDateOfBirth(LocalDate.of(1989, 11, 27));
		return amber;
	}

	@RequestMapping("/coupon")
	Coupon coupon() {
		Coupon coupon = new Coupon();
		return coupon;
	}
}
