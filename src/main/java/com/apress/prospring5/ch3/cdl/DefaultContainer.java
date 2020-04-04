package com.apress.prospring5.ch3.cdl;

// 실 구현 클래스 
public class DefaultContainer implements Container{
	
	// 실 구현 
	@Override
	public Object getDependency(String keys) {
		
		// key 
		if("myDependency".equals(keys))
			//오브젝트 객체를 반
			return new Dependency();
		
		// 에러 
		throw new RuntimeException("NO Dependency : "+keys);
		
	}
}
