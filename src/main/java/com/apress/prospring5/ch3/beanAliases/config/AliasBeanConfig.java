package com.apress.prospring5.ch3.beanAliases.config;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring5.ch3.beanAliases.annotated.Singer;

@Configuration
public class AliasBeanConfig {
	
	//@Bean(id="johnMayer")
	@Bean(name = "jon johnny,jonathan;jim")
	//@Bean(name = {"johnMayer", "john", "jonathan", "johnny"})
	public Singer singer() {
		return new Singer();
	}
}
