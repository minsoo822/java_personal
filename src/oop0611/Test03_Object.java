package oop0611;

import java.lang.*; //자바의 기본 팩키지
					//생략할수 있다

class Korea extends Object{ //extends Object는 생략할 수 있다
							//자바늬 모든 클래스는 Object클래스를 상속받아야 한다
	String name="대한민국";
	public void disp() {
		System.out.println(this.name);
	}//disp() end
	
}//class end


class Seoul extends Korea { //extends 부모클래스
	String name="서울특별시";
	
	@Override //<- 물려받은 메소드를 다시 작성(리폼, 재정의)
	public void disp() {
			System.out.println(this.name);
	}//disp() end
	
	@Override
	public String toString() {
			return "[name=" + name + "]";
	}
	
}//class end


class Busan extends Korea {
	private String name="부산 광역시";
	private String addr="경상남도";
	
	public Busan() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//코딩시 에러 체크하는 용도로 많이 활용
	//toString()함수는 자동 코딩 할 수 있음
	//메뉴Source->Generate toString()..
	@Override
	public String toString() {
		return "Busan [name=" + name + ", addr=" + addr + "]";
	}
		
}//class end


public class Test03_Object {

	public static void main(String[] args) {
		// Object 클래스
		//->자바의 최고 조상 클래스
		//->java.lang 팩키지에 선언되어 있음
		//->자바의 모든 클래스는 Object클래스의 후손들이다(맞다)
		
		//JavaSE API
		//https://docs.oracle.com/javase/8/docs/api/
		
		//상속
		//->부모와 자식, 조상과 후손, super와 sub
		//->extends		확장
		//->implements	구현
		
		
		Seoul se=new Seoul();
		se.disp();
		System.out.println(se.toString());
		System.out.println(se); //toString()함수명을 생략하면서 호출가능하다
		
		
		Busan bu=new Busan();
		System.out.println(bu.toString());
		System.out.println(bu);
		

		
	}//main() end
}//class end
