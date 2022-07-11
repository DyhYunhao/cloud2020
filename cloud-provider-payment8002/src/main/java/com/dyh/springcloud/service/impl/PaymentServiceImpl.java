package com.dyh.springcloud.service.impl;

import com.dyh.springcloud.dao.PaymentDao;
import com.dyh.springcloud.entities.Payment;
import com.dyh.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther daiyunhao
 * @create 2022/7/6
 * @desc
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
