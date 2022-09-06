package com.dyh.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther daiyunhao
 * @create 2022/9/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaProviderPayment9003Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9003Application.class, args);
    }
}
