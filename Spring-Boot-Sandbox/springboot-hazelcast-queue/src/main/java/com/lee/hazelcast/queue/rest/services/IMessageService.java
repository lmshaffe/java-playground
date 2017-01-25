package com.lee.hazelcast.queue.rest.services;

public interface IMessageService {

	/**
	 * There are messages in the message queue.
	 * @return The number of messages in the message queue.
	 */
	long count();

	/**
	 * Produces a message in the message queue.
	 * @param Post the message to add.
	 * @return
	 */
	boolean produce(String message);

	/**
	 * Consumes a message in the message queue.
	 * @return Consumed messages, or "empty" if the message queue is empty.
	 */
	String consume();
}
