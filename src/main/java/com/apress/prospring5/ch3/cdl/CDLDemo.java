package com.apress.prospring5.ch3.cdl;

public class CDLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컨테이너 인터테이스 
		Container container = new DefaultContainer();
		
		ManagedComponent managedComponent = new ContextualizedDepencyLookup();
		managedComponent.performLookup(container); //의존 객체를 컨테이너를 통해 룩업 
		
		System.out.println(managedComponent);
	}

	/*
	 * 의존성 룩업
	 * 	의존성 풀 
	 *  의존성 룩업 모두 코드량이 많아
	 * 의존성 주입 -> 훨씬 간단하다 
	 *  생성자 주입 
	 *  수정자 주입 
	 * 
	 * */ 
	
}
