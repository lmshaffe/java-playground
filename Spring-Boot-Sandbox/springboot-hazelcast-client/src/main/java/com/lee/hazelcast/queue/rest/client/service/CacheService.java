package com.lee.hazelcast.queue.rest.client.service;

import java.util.List;

public interface CacheService {
	//@Cacheable("merchantList") // (1)
	List<String> getList();
	String resetEntries();

	//	@CachePut(value = "merchantList", key = "#merchantList + 1") // (2)
	//	String setMerchantList(String merchant);
}
