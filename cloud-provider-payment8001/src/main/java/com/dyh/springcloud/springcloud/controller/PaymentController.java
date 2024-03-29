package com.dyh.springcloud.springcloud.controller;

import com.dyh.springcloud.entities.CommonResult;
import com.dyh.springcloud.entities.Payment;
import com.dyh.springcloud.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private DiscoveryClient discoveryClient;

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

    @GetMapping(value ="/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String e: services) {
            log.info("------e: " + e);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance: instances) {
            log.info(instance.getServiceId()+"\t" + instance.getHost()+"\t"+ instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value ="/payment/lb")
    public String getByLb() {
      return serverPort;
    }

    /**
     * 链路监控
     *
     * @return
     */
    @GetMapping("zipkin")
    public String paymentZipkin() {
        return "hi,i`am paymentzipkin server fall back.welcome to atguigu.hahahahahhahahah";
    }
}
