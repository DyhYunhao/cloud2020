package com.dyh.springcloud.service;

import com.dyh.springcloud.entities.CommonResult;
import com.dyh.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther daiyunhao
 * @create 2022/9/2
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
