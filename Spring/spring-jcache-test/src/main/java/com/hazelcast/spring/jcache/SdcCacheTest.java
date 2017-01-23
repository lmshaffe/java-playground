package com.hazelcast.spring.jcache;

import static java.lang.String.format;
import static java.lang.System.nanoTime;
import static java.lang.System.out;

import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;

/**
 * Calculation time for non-cached and cached results of DummyBean.getCity() invocations
 */
class SdcCacheTest {

	static void doInvocation(ApplicationContext context) {
		CacheService sdcCache = (CacheService) context.getBean("sdcCache");

		String logFormat = "%s call took %d millis with result: %s";
		long start1 = nanoTime();
		String city = sdcCache.getSdcList();
		long end1 = nanoTime();
		out.println(format(logFormat, "First", TimeUnit.NANOSECONDS.toMillis(end1 - start1), city));

		long start2 = nanoTime();
		city = sdcCache.getSdcList();
		long end2 = nanoTime();
		out.println(format(logFormat, "Second", TimeUnit.NANOSECONDS.toMillis(end2 - start2), city));
	}
}
