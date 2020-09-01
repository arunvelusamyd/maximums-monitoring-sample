package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringBootCrnkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrnkApplication.class, args);
	}

	/*@Bean(destroyMethod = "shutdown")
	public HazelcastInstance createStorageNode() throws Exception {
		return Hazelcast.newHazelcastInstance(new Config().setGroupConfig(new GroupConfig("employee-service")));
	}*/


}
