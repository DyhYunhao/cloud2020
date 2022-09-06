package com.dyh.springcloud.springcloud.controller;

import com.dyh.springcloud.springcloud.service.IMessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther daiyunhao
 * @create 2022/8/22
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProviderService providerService;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return providerService.send();
    }

}
