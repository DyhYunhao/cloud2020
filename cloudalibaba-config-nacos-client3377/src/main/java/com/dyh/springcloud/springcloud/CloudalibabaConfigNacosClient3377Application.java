package com.dyh.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther daiyunhao
 * @create 2022/8/29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaConfigNacosClient3377Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConfigNacosClient3377Application.class, args);
    }
}
