package com.apress.prospring5.ch3.methodInjection.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

import com.apress.prospring5.ch3.methodInjection.annotated.DemoBean;
import com.apress.prospring5.ch3.methodInjection.annotated.Singer;

public class LookupDemo {

	public static void main(String... args) {
		GenericApplicationContext ctx =
				new AnnotationConfigApplicationContext(LookupConfig.class);
		

		DemoBean abstractBean = ctx.getBean("abstractLookupBean", DemoBean.class);
		DemoBean standardBean = ctx.getBean("standardLookupBean", DemoBean.class);

		displayInfo("abstractLookupBean", abstractBean); // 추상 클래스로 통해 비 싱글턴으로 생
		displayInfo("standardLookupBean", standardBean); // 싱글턴으로 생성 

		ctx.close();
	}

	public static void displayInfo(String beanName, DemoBean bean) {
		Singer singer1 = bean.getMySinger();
		Singer singer2 = bean.getMySinger();

		System.out.println("[" + beanName + "]: Singer 인스턴스는 같은가? "
				+ (singer1 == singer2));

		StopWatch stopWatch = new StopWatch();
		stopWatch.start("lookupDemo");

		for (int x = 0; x < 100000; x++) {
			Singer singer = bean.getMySinger();
			singer.sing();
		}

		stopWatch.stop();
		System.out.println("100000번을 얻어오는 데 걸린 시간: " + stopWatch.getTotalTimeMillis() + " ms");
	}
}
