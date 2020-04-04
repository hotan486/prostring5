package com.apress.prospring5.ch3.dependencyPull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class DependencyPull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/app-context.xml");
		//제어의 역전 현상 
		MessageRenderer messageRenderer = 
				applicationContext.getBean("renderer", MessageRenderer.class);
		messageRenderer.render();
	}

}
