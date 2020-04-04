package com.apress.prospring5.ch4.environment;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

public class EnvironmentSampleLast {

    public static void main(String... args) {
    	
    	// xml 컨테이너 초기
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        // 빈 생
        ctx.refresh();
        
        // ApplicationContext에 ConfigurableEnvironment 인터페이스를 참조하여 
        // Environmen를 가져옴 
        ConfigurableEnvironment env = ctx.getEnvironment();
        
        // Environmen 통해 PropertySources를 가져옴 
        MutablePropertySources propertySources = env.getPropertySources();
        	
        // 복사할 객체를 선언
        Map<String,Object> appMap = new HashMap<>();
        // 
        appMap.put("application.home", "application_home");
        
        //
        propertySources.addLast(new MapPropertySource("prospring5_MAP", appMap));

        System.out.println("user.home: " + System.getProperty("user.home"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
        System.out.println("JAVA_HOME: " + System.getProperty("JAVA_HOME"));
        System.out.println("user.home: " + env.getProperty("user.home"));
        System.out.println("JAVA_HOME: " + env.getProperty("JAVA_HOME"));

        System.out.println("application.home: " + env.getProperty("application.home"));

        ctx.close();
    }
}