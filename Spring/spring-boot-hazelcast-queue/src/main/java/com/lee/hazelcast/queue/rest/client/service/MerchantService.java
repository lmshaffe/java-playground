package com.lee.hazelcast.queue.rest.client.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.ctm.rm.merchant.activemerchants.vo.ActiveMerchantVo;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

@Component
@EnableCaching
public class MerchantService implements CacheService {

	@Autowired
	HazelcastInstance client;

	@Autowired
	Environment env;

	@Override
	public List<String> getMerchantList() {
		System.out.println("method called!");

		List<String> merchantList = new ArrayList<String>();
		IMap<String, ActiveMerchantVo> gridMap = client.getMap("PreLoad-ActiveMerchantVos");
		ArrayList<ActiveMerchantVo> nameList = new ArrayList<ActiveMerchantVo>(gridMap.values());

		for (ActiveMerchantVo activeMerchant : nameList) {
			merchantList.add(activeMerchant.getBusinessName());
		}
		merchantList.add(new Integer(merchantList.size()).toString());
		return merchantList;
	}

	//	@Override
	//	public String setMerchantList(String merchantList) {
	//		return merchantList;
	//	}

}
