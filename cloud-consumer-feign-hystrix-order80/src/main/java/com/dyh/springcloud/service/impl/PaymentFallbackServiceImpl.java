package com.dyh.springcloud.service.impl;

import com.dyh.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @auther daiyunhao
 * @create 2022/8/2
 * @desc
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
