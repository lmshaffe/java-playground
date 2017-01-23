package com.lee.hazelcast.queue.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lee.hazelcast.queue.rest.client")
public class MyHazelcastClient {
	public static void main(String[] args) {
		SpringApplication.run(MyHazelcastClient.class, args);
	}
}
