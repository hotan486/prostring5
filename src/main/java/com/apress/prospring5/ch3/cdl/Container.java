package com.apress.prospring5.ch3.cdl;

// 데이터를 출력 하는 인터페이스 껍데기 
public interface Container {
	Object getDependency(String key);
}
