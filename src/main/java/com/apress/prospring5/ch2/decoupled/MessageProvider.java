package com.apress.prospring5.ch2.decoupled;

//메세지 출력 용도 
//클래스 교체를 용이하게 
public interface MessageProvider {
	
	// 메세지 생성된 클래스에서 들어온 데이터 출력 
	String getMessage();
}
