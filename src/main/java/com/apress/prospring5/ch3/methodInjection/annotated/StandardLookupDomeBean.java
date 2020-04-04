package com.apress.prospring5.ch3.methodInjection.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("standardLookupBean")
public class StandardLookupDomeBean implements DemoBean {

	private Singer mySinger;
	
	@Autowired
	@Qualifier("singer")
	public void setMySinger(Singer mySinger) {
		this.mySinger = mySinger;
	}

	@Override
	public Singer getMySinger() {
		return this.mySinger;
	}

	@Override
	public void doSomething() {
		mySinger.sing();
	}
}

