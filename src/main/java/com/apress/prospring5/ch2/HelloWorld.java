package com.apress.prospring5.ch2;

import com.apress.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import com.apress.prospring5.ch2.decoupled.StandardOutMessageRenderer;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("HelloWorld!");
		
//		if(args.length > 0) {
//			System.out.println(args[0]);
//		}else
//			System.out.println("HelloWorld!");
		
		//실제 출력 되는 클래스 먼저 호출 
		MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		//데이터 생성 
		MessageProvider messageProvider = new HelloWorldMessageProvider();
		
		//데이터 주입 
		messageRenderer.setMessageProvider(messageProvider);
		//데이터 출력 
		messageRenderer.render();
		
	}

}
