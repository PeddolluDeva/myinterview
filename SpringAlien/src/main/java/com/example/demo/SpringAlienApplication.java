package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAlienApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SpringAlienApplication.class, args);
//		SpringApplication.run(SpringAlienApplication.class, args);
	//     System.out.println("love you Gold");
	 //  Ailen a=context.getBean(Ailen.class);
	   // a.show();
        Ailen a1=context.getBean(Ailen.class);
	    a1.show();
	}

}
