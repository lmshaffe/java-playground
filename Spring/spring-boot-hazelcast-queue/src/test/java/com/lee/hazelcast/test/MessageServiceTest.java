package com.lee.hazelcast.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.test.TestHazelcastInstanceFactory;
import com.lee.hazelcast.queue.rest.services.IMessageService;
import com.lee.hazelcast.queue.rest.services.MessageServiceImpl;
@Ignore
public class MessageServiceTest {

	private static TestHazelcastInstanceFactory testInstanceFactory = new TestHazelcastInstanceFactory();

	private IMessageService messageService;

	@Before
	public void setUp() {
		final HazelcastInstance instance = testInstanceFactory.newHazelcastInstance();
		messageService = new MessageServiceImpl(instance);
	}

	@Test
	public void testCount() throws Exception {
		this.givenMessages().forEach(messageService::produce);

		long count = messageService.count();

		Assert.assertEquals(3, count);
	}

	@After
	public void cleanUp() throws Exception {
		Hazelcast.shutdownAll();
	}

	private List<String> givenMessages() {
		List<String> messages = new ArrayList<>();
		messages.add("Message 1");
		messages.add("Message 2");
		messages.add("Message 3");
		return messages;
	}

}
