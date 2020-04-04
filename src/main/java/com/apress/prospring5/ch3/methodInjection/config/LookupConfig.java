package com.apress.prospring5.ch3.methodInjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.apress.prospring5.ch3.methodInjection.annotated"})
public class LookupConfig {
	
}
