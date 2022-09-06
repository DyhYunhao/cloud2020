package com.dyh.springcloud.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dyh.springcloud.entities.CommonResult;

/**
 * @auther daiyunhao
 * @create 2022/8/31
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }


    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
