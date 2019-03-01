package com.spring.beans;

public class Bean2 {
	public Bean2(){
		
	}
	private Bean3 bean3;
	public Bean3 getBean3() {
		return bean3;
	}
	public void setBean3(Bean3 bean3) {
		this.bean3 = bean3;
	}
	
	public void xBean2Method(){
		bean3.xBean3Method();
	}
}
