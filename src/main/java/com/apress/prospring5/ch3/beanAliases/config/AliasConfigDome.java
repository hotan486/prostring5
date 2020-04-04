package com.apress.prospring5.ch3.beanAliases.config;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.apress.prospring5.ch3.beanAliases.annotated.Singer;

public class AliasConfigDome {

	public static void main(String...strings) {
		GenericApplicationContext genericXmlApplicationContext =
				new AnnotationConfigApplicationContext(AliasBeanConfig.class);
		
		Map<String, Singer> beans = genericXmlApplicationContext.getBeansOfType(Singer.class);
		beans.entrySet().stream().forEach(b ->
				System.out.println(
						"id: " + b.getKey() + "\n 별칭: "
								+ Arrays.toString(genericXmlApplicationContext.getAliases(b.getKey())) + "\n")
		);
		genericXmlApplicationContext.close();
		
	}

}
