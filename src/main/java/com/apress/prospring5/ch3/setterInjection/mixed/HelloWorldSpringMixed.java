package com.apress.prospring5.ch3.setterInjection.mixed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import com.apress.prospring5.ch3.setterInjection.mixed.HelloworldConfiguration;

public class HelloWorldSpringMixed {
	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext
				(HelloworldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
