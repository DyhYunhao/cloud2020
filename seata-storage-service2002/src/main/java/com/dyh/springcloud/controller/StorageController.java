package com.dyh.springcloud.controller;

import com.dyh.springcloud.domain.CommonResult;
import com.dyh.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther daiyunhao
 * @create 2022/9/5
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;
    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功！");
    }
}
