package com.dyh.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther daiyunhao
 * @create 2022/9/5
 */
@Configuration
@MapperScan({"com.dyh.springcloud.dao"})
public class MyBatisConfig {
}
