package com.apress.prospring5.ch3.methodInjection;

import org.springframework.context.ApplicationContextAware;

// 룩업 메서드 주입 : 싱글턴 빈이 다른 비싱글턴 빈에 의존시 문제발
// 수정자나 생성자 -> 비성글턴을 싱글턴으로 만듬 
// 싱글턴 빈으로 비싱글틴을 매번 새로 하고 싶다...

// lockOpener 사물함(locker)을 여는 서비스 
// lockOpener 는 주입 된 KeyHelper 를 의존
// keyHepler 는 재사용에 미적합 
// openLock() 메서드 호출시 새로운 KeyHelper 비싱글턴이 필
// lockOpener 는 싱글턴 

// 일반적 생성자나 수정자 주입시 keyHepler 는 재사용 됨
// 새로이 스턴스 전달 하려면 룩업 메서드 주입이 필요

// ApplicationContextAware 인터페이스로  싱글턴은 ApplicationContext 사용 비싱글턴 의존을 새로이 인스턴스 가능 
// 동일한 방식이 룩업 메서드 주입

// 사용
// 비싱글턴 빈의 인스턴스를 반환하는 룩업 메서드를 싱글턴 빈에 선언

// 싱글턴에 참조 -> 룩업메서드를 사용해서 동적생성 서브클래스에 참조
// abstract 사용하여 선언

// 하나의 비싱글턴 빈과 두개의 싱글턴 빈을 생성
// 하나는 수정자 하나는 메서드 주입

// 하나의 비 싱글턴 빈 
public class Singer {
	
	private String lyric = "I played a quick game of chess with the salt and pepper shaker";

    public void sing() {
    	// 콘솔을 오염시키지 않으려고 주석 처리함
        //System.out.println("메서");
    	
    }
}
