package com.practice.oop0825;

public class IPHONE1 extends Phone{

	public IPHONE1(String name) {
		this.name = name;	//Phone class에 보내준다
	}
	
	
	@Override
	public void function() {
		
		if (this.name.equals("아이폰12")) {
			super.function();	//아이폰 12 일때만 부모의 기능 (지문인식기능)을 함께 출력하고 
								//아니면 오버라이딩한(재정의) 기능만 출력한다.
			
			System.out.print("apple pay기능을 가지고있다.");
		}
		
	}
	
	
	
	
	
	
}
