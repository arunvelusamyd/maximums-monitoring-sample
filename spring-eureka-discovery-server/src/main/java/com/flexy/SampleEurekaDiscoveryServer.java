package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableEurekaServer
public class SampleEurekaDiscoveryServer {

    public static void main(String[] args) {
        SpringApplication.run(SampleEurekaDiscoveryServer.class, args);
    }

}
