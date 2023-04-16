package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Value("${value.name2}")
    private String name2;

    @Value("${value.apellido2}")
    private String apellido2;

    @Value("${value.random2}")
    private String random2;


    @Bean
    public MyBeanWithProperties function(){
        return new MiBeanWithPropertiesImplement(name,apellido);
    }

    @Bean
    public MyBeanWithProperties2 function2(){
        return new MyBeanWithPropertiesImplement2(name2,apellido2);

    }
}
