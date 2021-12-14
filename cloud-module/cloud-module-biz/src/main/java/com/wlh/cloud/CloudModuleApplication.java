package com.wlh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudModuleApplication.class, args);
    }

}
