package com.dyh.springcloud.service;

import com.dyh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther daiyunhao
 * @create 2022/7/6
 * @desc
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);
}
