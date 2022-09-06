package com.dyh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther daiyunhao
 * @create 2022/9/2
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudalibabaConsumerNacosOrder84Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConsumerNacosOrder84Application.class, args);
    }
}
