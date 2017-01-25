package com.lee.hazelcast.queue.rest.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IQueue;

@Service
public class MessageServiceImpl implements IMessageService {

	public static final String QUEUE = "messages";

	private HazelcastInstance instance;

	@Autowired
	public MessageServiceImpl(HazelcastInstance instance) {
		this.instance = instance;
	}

	public long count() {
		IQueue<String> queue = instance.getQueue(QUEUE);
		return queue.size();
	}

	public boolean produce(final String message) {
		IQueue<String> queue = instance.getQueue(QUEUE);
		Date date = new Date();
		return queue.offer(message + " - " + date.toString());
	}

	public String consume() {
		IQueue<String> queue = instance.getQueue(QUEUE);
		return queue.isEmpty() ? "Empty" : queue.poll();
	}
}
