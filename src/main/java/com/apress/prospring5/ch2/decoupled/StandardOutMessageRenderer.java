package com.apress.prospring5.ch2.decoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;
	
	// 실제 데이터 출력되는 부분 
	@Override
	public void render() {
		// TODO Auto-generated method stub
		if(messageProvider == null) {
			throw new RuntimeException(
					"StandardOutMessageRenderer : " + StandardOutMessageRenderer.class.getName()
			);
		}
		System.out.println(messageProvider.getMessage());
	}
	
	// 데이터 주입
	@Override
	
	public void setMessageProvider(MessageProvider messageProvider) {
		// TODO Auto-generated method stub
		this.messageProvider = messageProvider;
	}

	// 데이터 출력 
	@Override
	public MessageProvider getmMessageProvider() {
		// TODO Auto-generated method stub
		return this.messageProvider;
	}

}
