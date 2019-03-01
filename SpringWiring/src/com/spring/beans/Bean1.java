package com.spring.beans;

public class Bean1 {
	public Bean1(){
		
	}
	private Bean2 bean2;
	public Bean2 getBean2() {
		return bean2;
	}
	public void setBean2(Bean2 bean2) {
		this.bean2 = bean2;
	}
	
	public void xBean1Method(){
		bean2.xBean2Method();
	}
}
