package com.apress.prospring5.ch2.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apress.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import com.apress.prospring5.ch2.decoupled.StandardOutMessageRenderer;

//xml 동일 설정 정보 
@Configuration
public class HelloWorldConfiguration {
	
	// 클래스 주입 
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	} 
	
	// 클래스 주입 
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		messageRenderer.setMessageProvider(provider());
		return messageRenderer;
	}
}
