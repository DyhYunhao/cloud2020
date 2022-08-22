package com.dyh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther daiyunhao
 * @create 2022/8/19
 */
@RestController
//@RefreshScope 实现热加载 自动获取刷新内容
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
