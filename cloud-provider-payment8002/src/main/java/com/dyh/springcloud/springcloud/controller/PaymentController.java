package com.dyh.springcloud.springcloud.controller;

import com.dyh.springcloud.entities.CommonResult;
import com.dyh.springcloud.entities.Payment;
import com.dyh.springcloud.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @auther daiyunhao
 * @create 2022/7/6
 * @desc
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("----插入结果----: " + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功, serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        Payment result = paymentService.getPayment(id);
        log.info("----查询结果----: " + result);
        if (result != null) {
            return new CommonResult(200, "查询成功,  serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "无对应记录, id: " + id, null);
        }
    }

    @GetMapping(value ="/payment/lb")
    public String getByLb() {
        return serverPort;
    }
}
