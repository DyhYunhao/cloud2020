package com.dyh.springcloud.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @auther daiyunhao
 * @create 2022/7/16
 * @desc
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    private String paymentZk() {
        return "spring cloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
