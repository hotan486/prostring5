package com.apress.prospring5.ch3.sampleTypes.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {

	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring/simpleType/app-context-simple-xml.xml");
		ctx.refresh();

		InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(simple);

		ctx.close();
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "이름: " + name + "\n"
				+ "나이: " + age + "\n"
				+ "나이(초): " + ageInSeconds + "\n"
				+ "키: " + height + "\n"
				+ "프로그래머입니까?: " + programmer;
	}
}

