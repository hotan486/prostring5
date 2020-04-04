package com.apress.prospring5.ch3.setterInjection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {
	
	public static void main(String[] args) {
		
		// 빈 팩토리 정
		DefaultListableBeanFactory defaultListableBeanFactory = 
				new DefaultListableBeanFactory();
		// 팩토리를 넣고  
		XmlBeanDefinitionReader xmlBeanDefinitionReader =
				new XmlBeanDefinitionReader(defaultListableBeanFactory);
		
		//프로퍼티를 통해서도 해당 내용을 주입 가능하다 
		//PropertiesBeanDefinitionReader
		
		//xml 파일를 읽으면 팩토리에서 해당정보 주입   
		xmlBeanDefinitionReader.loadBeanDefinitions(
				new ClassPathResource("spring/xml-bean-factory-config.xml"));
		
		//해당 팩토리에서 정보 객체 정보를 가져오고 
		Oracle oracle = (Oracle)defaultListableBeanFactory.getBean("oracle");
		
		//실제 가져온건지만 출력 
		System.out.println(oracle.defineMeaningOfLife());
	}
	
	// 빈 팩토리를 구현 하는것 복잡하다 
	// 그래서 이미 만들어진 applicationContext를 사용하는걸 권장한다.
}
