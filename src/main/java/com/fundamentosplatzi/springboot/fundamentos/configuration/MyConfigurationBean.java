package com.fundamentosplatzi.springboot.fundamentos.configuration;


import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOwnDependency;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOwnOperation;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOwnDependencyImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOwnOperationImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }



    @Bean
    public MyOwnDependency beanOperationOperationWithDependencyOwn(MyOwnOperation myOwnOperation){
        return new MyOwnDependencyImplement(myOwnOperation);
    }
}
