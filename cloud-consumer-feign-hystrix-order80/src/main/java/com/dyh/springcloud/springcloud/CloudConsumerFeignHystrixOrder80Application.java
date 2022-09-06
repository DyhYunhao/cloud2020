package com.dyh.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther daiyunhao
 * @create 2022/8/2
 * @desc
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudConsumerFeignHystrixOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80Application.class, args);
    }
}
