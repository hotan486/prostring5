package com.apress.prospring5.ch3.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.prospring5.ch2.annotated.HelloWorldConfiguration;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringAnnotated {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new
				AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer = applicationContext.getBean("renderer",MessageRenderer.class);
		messageRenderer.render();
	}
}
