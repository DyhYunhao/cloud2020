package com.dyh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther daiyunhao
 * @create 2022/9/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaProviderPayment9004Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9004Application.class, args);
    }
}
