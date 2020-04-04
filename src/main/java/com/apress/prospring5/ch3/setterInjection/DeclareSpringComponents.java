package com.apress.prospring5.ch3.setterInjection;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class DeclareSpringComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext genericXmlApplicationContext =
				new GenericXmlApplicationContext();
		
		genericXmlApplicationContext.
		load("spring/app-context-xml.xml");
		
		genericXmlApplicationContext.refresh();
		
		MessageRenderer messageRenderer = 
				genericXmlApplicationContext
				.getBean("renderer", MessageRenderer.class);
		messageRenderer.render();
		genericXmlApplicationContext.close();
		
	}

}
