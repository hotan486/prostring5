package com.apress.prospring5.ch4.propertyPlaceholder;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlaceHolderDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/propertyPlaceholder/app-context-xml.xml");
        ctx.refresh();

        AppProperty appProperty = ctx.getBean("appProperty", AppProperty.class);

        System.out.println("application.home: " + appProperty.getApplicationHome());
        System.out.println("user.home: " + appProperty.getUserHome());

        ctx.close();
    }
}
