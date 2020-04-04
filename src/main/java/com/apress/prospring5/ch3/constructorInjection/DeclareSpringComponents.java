package com.apress.prospring5.ch3.constructorInjection;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

public class DeclareSpringComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring/app-context-annotation-constructor.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("provider",
            MessageProvider.class);

        System.out.println(messageProvider.getMessage());
        ctx.close();
	}

}
