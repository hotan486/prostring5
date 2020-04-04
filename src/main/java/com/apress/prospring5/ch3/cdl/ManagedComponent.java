package com.apress.prospring5.ch3.cdl;

// 컨테이너를 파라미터로 -> 컨포넌트 처리하는 껍데기 인터 페이스  
public interface ManagedComponent {
	void performLookup(Container container);
}
