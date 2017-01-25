package com.lee.hazelcast.queue.rest.client.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.ctm.rm.merchant.activemerchants.vo.ActiveMerchantVo;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

@Component
public class MerchantService implements CacheService {

	@Autowired
	HazelcastInstance client;

	@Autowired
	Environment env;

	@Cacheable(value="merchantList")
	public List<String> getList() {
		try {
			System.out.println("method called!");
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<String> merchantList = new ArrayList<String>();
		IMap<String, ActiveMerchantVo> gridMap = client.getMap(env.getProperty("app.hazelcast.activeMerchantVos"));
		ArrayList<ActiveMerchantVo> nameList = new ArrayList<ActiveMerchantVo>(gridMap.values());

		for (ActiveMerchantVo activeMerchant : nameList) {
			merchantList.add(activeMerchant.getBusinessName());
		}
		merchantList.add(new Integer(merchantList.size()).toString());
		return merchantList;
	}

	@CacheEvict(value = "merchantList", allEntries = true)
	public String resetEntries() {
		return "Merchant cache cleared";
	}

	//	@Override
	//	public String setMerchantList(String merchantList) {
	//		return merchantList;
	//	}

}
