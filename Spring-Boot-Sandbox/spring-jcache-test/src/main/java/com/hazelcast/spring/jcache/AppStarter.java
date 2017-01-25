package com.hazelcast.spring.jcache;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.hazelcast.spring.jcache.SdcCacheTest.doInvocation;

/**
 * Example of Spring Caching with JCache
 */
public class AppStarter {

    public static void main(String[] args) {
        System.setProperty("hazelcast.jcache.provider.type", "client");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        doInvocation(applicationContext);

        HazelcastClient.shutdownAll();
        Hazelcast.shutdownAll();
    }
}
