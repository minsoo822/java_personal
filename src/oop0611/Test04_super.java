package oop0611;


class School{
	public String name="학교";
	public School() {
		System.out.println("School()...");
	}//end
}//class end


class MiddleSchool extends School {
	public String name="중학교";
	public MiddleSchool() {
		
		super(); //부모생성자 함수를 호출하는 명령어 생략되어 있음
		
		System.out.println("MiddleSchool()...");
	}//end
}//class ens


class HighSchool extends School {
	public String name="고등학교";
	public HighSchool() {
		super();//생략가능
		System.out.println("HighSchool()...");
	}//end
	
	public void disp() {
		String name="서초고등학교";
		System.out.println(name);	    //서초고등학교. 지역변수
		System.out.println(this.name);  //고등학교. this.멤버면수
		System.out.println(super.name); //학교.	  super.부모멤버
	}//disp() end
}//class end


public class Test04_super {

	public static void main(String[] args) {
		//super, 부모, 조상
		/*
		   super	: 자식클래스에서 부모클래스 멤버변수에 접근할 때
		   super()	: 자식클래스의 생성자함수가 부모클래스의 생성자 함수를 호출할 때
		   
		   this		: 멤버변수(field)와 지역변수를 구분하기 위해 
		   this()	: 자신의 생성자 함수를 호출할 때
		 */
		
		
		//상속관계에서는 부모생성자함수를 호출하고 자신의 생성자함수를 호출
		//School()->MiddleSchool
		MiddleSchool ms=new MiddleSchool();
		
		
		//School() -> HighSchool
		HighSchool hs=new HighSchool();
		hs.disp();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
