package com.dyh.springcloud.springcloud.service.impl;

import com.dyh.springcloud.springcloud.service.IMessageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @auther daiyunhao
 * @create 2022/8/22
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderService implements IMessageProviderService {
    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " + serial);
        return null;
    }
}
