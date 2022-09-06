package com.dyh.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther daiyunhao
 * @create 2022/8/31
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaSentinelService8401Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelService8401Application.class, args);
    }
}
