package com.dyh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther daiyunhao
 * @create 2022/7/17
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerzkOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerzkOrder80Application.class, args);
    }
}
