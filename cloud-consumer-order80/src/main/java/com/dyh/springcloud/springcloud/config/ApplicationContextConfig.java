package com.dyh.springcloud.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther daiyunhao
 * @create 2022/7/7
 * @desc 当前文件就是spring的配置文件
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * <bean id="" class="">
     * 配置bean 不然后面没法依赖注入，这里bean就像以前ssm整合时配置依赖注入一样
     */
    @Bean
    @LoadBalanced //让这个RestTemplate在请求时拥有客户端负载均衡的能力  //将此注解注释掉，使用自己的轮询算法不使用默认的
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
