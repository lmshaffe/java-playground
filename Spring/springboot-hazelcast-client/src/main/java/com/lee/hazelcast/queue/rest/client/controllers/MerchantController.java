package com.lee.hazelcast.queue.rest.client.controllers;

import static java.lang.String.format;
import static java.lang.System.nanoTime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lee.hazelcast.queue.rest.client.service.CacheService;

@RestController
public class MerchantController {

	@Autowired
	CacheService merchantService;

	@RequestMapping("/merchants/clear")
	public String clearMerchantEntries() {
		return merchantService.resetEntries();
	}

	@RequestMapping("/merchants")
	public List<String> getMerchantList() {
		String logFormat = "%s call took %d millis";
		long start1 = nanoTime();
		List<String> nameList = merchantService.getList();
		long end1 = nanoTime();
		System.out.println(format(logFormat, "Rest", TimeUnit.NANOSECONDS.toMillis(end1 - start1)));

		return nameList;
	}

	//	@RequestMapping(value = "city/{city}", method = RequestMethod.GET)
	//	public String setCity(@PathVariable String city) {
	//		return dummy.setMerchantList(city);
	//	}
}
