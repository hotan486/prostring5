package com.apress.prospring5.ch4.groovyConfigJava;

import com.apress.prospring5.ch4.groovyConfigJava.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyBeansFromJava {

	public static void main(String... args) {
		ApplicationContext context = new GenericGroovyApplicationContext("beans.groovy");
		Singer singer = context.getBean("singer", Singer.class);
		System.out.println(singer);
	}
}
