package com.dyh.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther daiyunhao
 * @create 2022/8/19
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenter {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter.class, args);
    }
}
