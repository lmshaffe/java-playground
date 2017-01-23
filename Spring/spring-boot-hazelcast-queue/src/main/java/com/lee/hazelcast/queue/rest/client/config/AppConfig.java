package com.lee.hazelcast.queue.rest.client.config;

import java.io.File;
import java.io.IOException;

import org.springframework.cache.CacheManager;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.spring.cache.HazelcastCacheManager;
import com.lee.hazelcast.queue.rest.client.service.CacheService;
import com.lee.hazelcast.queue.rest.client.service.MerchantService;

@Component
public class AppConfig {
	@Bean
	public CacheService merchantService() {
		return new MerchantService();
	}

	@Bean
	CacheManager cacheManager() {
		return new HazelcastCacheManager(hazelcastInstance());
	}

	@Bean
	KeyGenerator keyGenerator() {
		return new SimpleKeyGenerator();
	}

	@Bean
	@Profile("client")
	HazelcastInstance hazelcastInstance() {
		ClientConfig clientConfig;

		String fileName = "/Users/lshaffer/Documents/playground/spring-boot-hazelcast/src/main/resources/hazelcast.xml";
		File cfgFile = new File(fileName);
		try {
			XmlClientConfigBuilder bldr = new XmlClientConfigBuilder(cfgFile);
			clientConfig = bldr.build();
		}
		catch (IOException e) {
			throw new RuntimeException("Cannot read client configuration file " + cfgFile.getPath());
		}
		return HazelcastClient.newHazelcastClient(clientConfig);
	}

}
