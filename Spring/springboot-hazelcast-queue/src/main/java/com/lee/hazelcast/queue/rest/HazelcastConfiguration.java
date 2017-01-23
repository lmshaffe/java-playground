package com.lee.hazelcast.queue.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;

@Configuration
public class HazelcastConfiguration {

	@Bean
	Config config() {
		return new Config();
	}

	//	@Bean
	//	public Config config() {
	//		//Useful if you have ManagementCenterConfig. Creates Hazelcast cluster and can share data between apps in the same JVM.
	//		//Can have multiple instances running. One producing and the other consuming
	//		//Can change to use regular config
	//		Config config = new Config();
	//		ManagementCenterConfig managementCenterConfig = new ManagementCenterConfig();
	//		managementCenterConfig.setEnabled(true);
	//		//set high to reduce output messages about POST not being supported on that URL
	//		managementCenterConfig.setUpdateInterval(10000);
	//		managementCenterConfig.setUrl("http://localhost:8080/mancenter");
	//		config.setManagementCenterConfig(managementCenterConfig);
	//		return config;
	//	}
}
