package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	private MyOwnDependency myOwnDependency;
	private MyBeanWithProperties myBeanWithProperties;

	private MyBeanWithProperties2 myBeanWithProperties2;

	private UserPojo userpojo;



	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency, MyOwnDependency myOwnDependency, MyBeanWithProperties myBeanWithProperties, MyBeanWithProperties2 myBeanWithProperties2, UserPojo userpojo){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myOwnDependency = myOwnDependency;
		this.myBeanWithProperties = myBeanWithProperties;
		this.myBeanWithProperties2 = myBeanWithProperties2;
		this.userpojo = userpojo;
	}




	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args)  {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		myOwnDependency.printOwnDependency();
		System.out.println(myBeanWithProperties.function());
		System.out.println(myBeanWithProperties2.funtion2());
		System.out.println(userpojo.getEmail() + " - " + userpojo.getPassword() + " - " + userpojo.getAge());
	}

}
