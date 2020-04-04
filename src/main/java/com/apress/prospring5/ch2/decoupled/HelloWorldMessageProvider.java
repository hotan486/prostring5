package com.apress.prospring5.ch2.decoupled;

import org.springframework.stereotype.Component;

//실제 메세지 생성 클래스 

public class HelloWorldMessageProvider implements MessageProvider{

	//출력
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World!";
	}

}
