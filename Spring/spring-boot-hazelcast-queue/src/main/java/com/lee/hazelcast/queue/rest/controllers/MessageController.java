package com.lee.hazelcast.queue.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lee.hazelcast.queue.rest.services.IMessageService;

@RestController
public class MessageController {

	@Autowired
	private IMessageService messageService;

	@RequestMapping("/")
	public String index() {
		return String.format("Greetings from Spring !");
	}

	@RequestMapping("/count")
	public String count() {
		long count = messageService.count();
		return String.format("Number of messages : " + count);
	}

	@RequestMapping("/put")
	public String put(String message) {
		boolean success = messageService.produce(message);
		return String.format("Message in queue success : %b", success);
	}

	@RequestMapping("/get")
	public String get() {
		return messageService.consume();
	}

}
