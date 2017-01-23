package com.hazelcast.spring.jcache;

import java.util.concurrent.TimeUnit;

public class SdcCache implements CacheService {

	public String getSdcList() {
		System.out.println("SdcCache.getSdcList() called!");
		try {
			// emulation of slow method
			System.out.println("Doing all the work to return data");
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Here is the SDC List!";
	}
}
