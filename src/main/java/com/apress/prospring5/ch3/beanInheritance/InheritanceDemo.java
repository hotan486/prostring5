package com.apress.prospring5.ch3.beanInheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 2/25/17.
 */
public class InheritanceDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/beanautowiring/app-context-xml.xml");
		ctx.refresh();

		Singer parent = (Singer) ctx.getBean("parent");
		Singer child = (Singer) ctx.getBean("child");

		System.out.println("부모:\n" + parent);
		System.out.println("자식:\n" + child);
	}
}
//abstract="true"
