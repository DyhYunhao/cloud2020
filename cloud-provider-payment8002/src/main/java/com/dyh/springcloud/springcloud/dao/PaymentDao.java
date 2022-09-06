package com.dyh.springcloud.springcloud.dao;

import com.dyh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther daiyunhao
 * @create 2022/7/6
 * @desc
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);
}
