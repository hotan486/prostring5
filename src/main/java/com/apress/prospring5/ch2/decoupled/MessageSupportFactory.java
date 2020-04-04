package com.apress.prospring5.ch2.decoupled;

import java.util.Properties;

public class MessageSupportFactory {
	
	// 인스턴스 생성 유일한 인스턴스 
	private static MessageSupportFactory messageSupportFactory;
	
	// 프로퍼티 받는 클래스 생성 
	private Properties properties;
	
	private MessageRenderer messageRenderer;
	private MessageProvider messageProvider;
	
	private MessageSupportFactory(){
		System.out.println("생성자 인가 ");
		properties = new Properties();
		
		try {
			System.out.println(this.getClass());
			//프로퍼티 파일을 가져옴 
			properties.load(this.getClass().getResourceAsStream("msf.properties"));
			//명시된 해당 클래스를 가져옴 
			String rendererClass = properties.getProperty("renderer.class");
			String providerClass = properties.getProperty("provider.class");
			//해당 클래스를 찾아 주입함 
			messageRenderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	static {
		System.out.println("static 인가 ");
		messageSupportFactory = new MessageSupportFactory();
		
	}
	
	//인스턴스 
	public static MessageSupportFactory getMessageSupportFactory() {
		return messageSupportFactory;
	}
	
	//프로퍼티 받아서 클래스 출력  
	public MessageRenderer getmMessageRenderer() {
		return messageRenderer;
	}
	
	//프로퍼티 받아서 클래스 출력	
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}
}
