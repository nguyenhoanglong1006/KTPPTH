package com.example.springboot_ActiveMq_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringbootActiveMqDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				SpringbootActiveMqDemoApplication.class, args);
		
		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("javainuse", "test message");
	}


}
