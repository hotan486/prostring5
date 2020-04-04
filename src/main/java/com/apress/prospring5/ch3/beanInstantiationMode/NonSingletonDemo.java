package com.apress.prospring5.ch3.beanInstantiationMode;

import com.apress.prospring5.ch3.beanInstantiationMode.annotated.*;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NonSingletonDemo {
    public static void main(String... args) {
          GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
          //ctx.load("classpath:spring/app-context-xml.xml");
          ctx.load("classpath:spring/beanInstantiationMode/app-context-annotated.xml");
          ctx.refresh();
        
          Singer singer1 = ctx.getBean("nonSingleton", Singer.class);
          Singer singer2 =  ctx.getBean("nonSingleton", Singer.class);
        
          System.out.println("식별자가 동일한가?: " + (singer1 ==singer2));
          System.out.println("값이 동일한가?: " + singer1.equals(singer2));
          System.out.println(singer1);
          System.out.println(singer2);

          ctx.close();
    }
}
