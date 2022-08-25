package com.practice.oop0825;

public class Phone {

	
	//필드
	public String name = "핸드폰";
	

	public void function() {
		System.err.println("은 지문인식 기능을 가지고있다.");
	}
	
	public void print() {
		System.out.println(name);	//name 프린
		function();					//각 클래스의 function메서드를 불러온다
	}
	
	
	
}
