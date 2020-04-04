package com.apress.prospring5.ch3.constructorInjection.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

@Service
public class ConfigurableMessageProvider implements MessageProvider{

	private String message;
	
	
	public ConfigurableMessageProvider(@Value("Configurable message")String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
