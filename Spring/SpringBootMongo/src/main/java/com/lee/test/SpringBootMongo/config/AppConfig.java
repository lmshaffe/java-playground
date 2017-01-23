package com.lee.test.SpringBootMongo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ "com.lee.test.SpringBootMongo" })
@Import({ SpringMongoConfig.class })
public class AppConfig {

}
