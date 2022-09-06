package com.dyh.springcloud.controller;

import com.dyh.springcloud.domain.CommonResult;
import com.dyh.springcloud.domain.Order;
import com.dyh.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther daiyunhao
 * @create 2022/9/5
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
