package com.apress.prospring5.ch3.beanAliases.xml;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNameAliasing {

	public static void main(String[] args) {
		
		// 컨테이너 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// 컨테이너 로드 
		ctx.load("classpath:spring/beanAliases/app-context-02.xml");
		// 컨테이너 객체 생성 
		ctx.refresh();

		// 각 이름으로 꺼
		String s1 = (String) ctx.getBean("john");
        String s2 = (String) ctx.getBean("jon");
        String s3 = (String) ctx.getBean("johnny");
        String s4 = (String) ctx.getBean("jonathan");
        String s5 = (String) ctx.getBean("jim");
        String s6 = (String) ctx.getBean("ion");
        
        // 하지만 다 같은 속성 값 
        System.out.println((s1 == s2)); 
        System.out.println((s2 == s3)); 
        System.out.println((s3 == s4)); 
        System.out.println((s4 == s5)); 
        System.out.println((s5 == s6));

        
        Map<String,String> beans = ctx.getBeansOfType(String.class);
        
        // 하지만 다 같은 속성 값 
        if(beans.size() == 1) {
            System.out.println("오직 하나의 String 빈만 존재함");
        }

	}

}
