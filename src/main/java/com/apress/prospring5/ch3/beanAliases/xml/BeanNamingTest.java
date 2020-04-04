package com.apress.prospring5.ch3.beanAliases.xml;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNamingTest {

	public static void main(String[] args) {
		
		// 컨테이너 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// 컨테이너 로드 
		ctx.load("classpath:spring/beanAliases/app-context-01.xml");
		// 컨테이너 객체 생성 
		ctx.refresh();

		// 스트링 타입 담음  
		Map<String,String> beans = ctx.getBeansOfType(String.class);

		// 해당 객체에 속성에 접근하여 해당 키값가져옴 
		beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));
		
		// 컨테이너 닫기
		ctx.close();
	
		//동일 아이디 경우 인덱스 구분 

	}

}
