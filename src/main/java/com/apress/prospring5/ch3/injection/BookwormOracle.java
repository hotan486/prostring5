package com.apress.prospring5.ch3.injection;

public class BookwormOracle implements Oracle{

	private Encyclopedia encyclopedia;
	
	public void setEncyclopedia(Encyclopedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}
	
	@Override
	public String defineMeaningOfLife() {
		// TODO Auto-generated method stub
		return "Encyclopedia : ";
	}

}
