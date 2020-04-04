package com.apress.prospring5.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/app-context.xml");
		
		MessageRenderer messageRenderer = applicationContext.getBean("renderer",MessageRenderer.class);
		messageRenderer.render();
	}

}
