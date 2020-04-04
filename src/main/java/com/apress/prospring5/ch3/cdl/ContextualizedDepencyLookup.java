package com.apress.prospring5.ch3.cdl;

import com.apress.prospring5.ch3.dependencyPull.DependencyPull;

//실 구현 
public class ContextualizedDepencyLookup implements ManagedComponent{
	
	// 객체를 받기 위해 선언 
	private Dependency dependency;
	
	// 컨테이너에 실 구현 데이터를 가져오는 주입부  
	@Override
	public void performLookup(Container container) {
		// TODO Auto-generated method stub
		this.dependency = (Dependency)container.getDependency("myDependency");
		
	}
	
	//이 클래스를 출력 
	@Override
	public String toString() {
		return dependency.toString();
	}
	
}
