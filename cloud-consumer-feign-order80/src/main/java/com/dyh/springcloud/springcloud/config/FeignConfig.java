package com.dyh.springcloud.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther daiyunhao
 * @create 2022/7/23
 * @desc
 */
@Configuration
public class FeignConfig {
    /**
     * NONE,
     * BASIC,
     * HEADERS,
     * FULL;
     * <p>
     * 日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
