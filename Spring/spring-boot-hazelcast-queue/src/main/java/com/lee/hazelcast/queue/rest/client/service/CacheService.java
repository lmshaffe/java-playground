package com.lee.hazelcast.queue.rest.client.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

public interface CacheService {
	@Cacheable("merchantList") // (1)
	List<String> getMerchantList();

	//	@CachePut(value = "merchantList", key = "#merchantList + 1") // (2)
	//	String setMerchantList(String merchant);
}
