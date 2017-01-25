package com.hazelcast.spring.jcache;

import javax.cache.annotation.CacheResult;

interface CacheService {

	@CacheResult(cacheName = "sdcList")
	String getSdcList();
}
