package com.hazelcast.spring.jcache;

import java.util.HashMap;
import java.util.Map;

import javax.cache.Caching;
import javax.cache.spi.CachingProvider;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.hazelcast.config.CacheSimpleConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@Configuration
@EnableCaching
@SuppressWarnings("unused")
class AppConfig {

	@Bean
	// we want to have Hazelcast member started before client JCache provider
	@DependsOn("instance")
	public CacheManager cacheManager() {
		CachingProvider cachingProvider = Caching.getCachingProvider();
		javax.cache.CacheManager cacheManager = cachingProvider.getCacheManager();
		return new JCacheCacheManager(cacheManager);
	}

	@Bean
	public CacheService sdcCache() {
		return new SdcCache();
	}

	@Bean
	public HazelcastInstance instance() {
		Map<String, CacheSimpleConfig> cacheConfigs = new HashMap<String, CacheSimpleConfig>();
		cacheConfigs.put("sdcList", new CacheSimpleConfig().setName("sdcList"));
		Config config = new Config().setCacheConfigs(cacheConfigs);
		return Hazelcast.newHazelcastInstance(config);
	}
}
