package com.apress.prospring5.ch3.beanAutowiring.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 2/23/17.
 */
public class AnnotatedDependsOnDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/beanautowiring/app-context-02.xml");
		ctx.refresh();

		Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
		johnMayer.sing();

		ctx.close();
	}

}
