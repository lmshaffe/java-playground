package com.lee.hazelcast.queue.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = "com.lee.hazelcast.queue.rest.client")
@EnableCaching
public class MyHazelcastClient {
	public static void main(String[] args) {
		SpringApplication.run(MyHazelcastClient.class, args);
	}
}
