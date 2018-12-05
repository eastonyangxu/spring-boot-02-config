package com.easton.springboot.config;

import com.easton.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类;就是来替换之前的Spring配置文件
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器添加组件了");
        return new HelloService() ;
    }

}
