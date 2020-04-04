package com.apress.prospring5.ch2.annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringAnnotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		MessageRenderer messageRenderer = applicationContext.getBean("renderer", MessageRenderer.class);
		messageRenderer.render();
	}

}
