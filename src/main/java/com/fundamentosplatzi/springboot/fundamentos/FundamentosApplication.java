package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.entity.User;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import com.fundamentosplatzi.springboot.fundamentos.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	private MyOwnDependency myOwnDependency;
	private MyBeanWithProperties myBeanWithProperties;

	private MyBeanWithProperties2 myBeanWithProperties2;

	private UserPojo userpojo;

	private UserRepository userRepository;



	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency, MyOwnDependency myOwnDependency, MyBeanWithProperties myBeanWithProperties, MyBeanWithProperties2 myBeanWithProperties2, UserPojo userpojo,UserRepository userRepository){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myOwnDependency = myOwnDependency;
		this.myBeanWithProperties = myBeanWithProperties;
		this.myBeanWithProperties2 = myBeanWithProperties2;
		this.userpojo = userpojo;
		this.userRepository = userRepository;
	}



	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args)  {
		//clasesAnteriores();
		savedUserInDataBase();
	}

	private void savedUserInDataBase(){
		User user1 = new User("Jaidenver","jaiderhurtado@gmail.com", LocalDate.of(2023, 5, 20));
		User user2 = new User("Cristian","cristian@gmail.com", LocalDate.of(2023,3,20));
		User user3 = new User("Andres","andres@gmail.com", LocalDate.of(2023,2,28));
		User user4 = new User("user4","user4@gmail.com", LocalDate.of(2023,3,20));
		User user5 = new User("user5","user5@gmail.com", LocalDate.of(2023,1,28));
		User user6 = new User("user6","user6@gmail.com", LocalDate.of(2023,8,10));
		User user7 = new User("user7","user7@gmail.com", LocalDate.of(2023,7,24));
		User user8 = new User("user8","user8@gmail.com", LocalDate.of(2023,4,19));
		User user9 = new User("user9","user9@gmail.com", LocalDate.of(2023,5,25));
		User user10 = new User("user10","user10@gmail.com", LocalDate.of(2023,7,25));

		List<User> list = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
		list.stream().forEach(userRepository::save);
	}

	public void clasesAnteriores(){
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		myOwnDependency.printOwnDependency();
		//System.out.println(myBeanWithProperties.function());
		System.out.println(myBeanWithProperties2.funtion2());
		//System.out.println(userpojo.getEmail() + " - " + userpojo.getPassword() + " - " + userpojo.getAge());

		try {
			//codigo
			int value = 10 / 0;
			LOGGER.debug("El valor es:" + value);
		}catch (Exception e){
			LOGGER.error("Esto es un error al dividir por 0" + e.getMessage());
		}


		try {
			String texto = "Esto no es un numero";
			Integer.parseInt(texto);
		}catch (Exception e){
			LOGGER.error("Esto no es un numero entero es una cadena de caracteres.");
		}
	}

}
