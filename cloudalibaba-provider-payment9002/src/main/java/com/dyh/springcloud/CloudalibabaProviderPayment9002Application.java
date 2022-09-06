package com.dyh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther daiyunhao
 * @create 2022/8/29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaProviderPayment9002Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9002Application.class, args);
    }
}
