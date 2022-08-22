package oop0611;

import java.util.Calendar;
import java.util.GregorianCalendar;



class Father extends Object { //extends Object 생략가능 
	public String name="아버지";
	public String addr="주소";
	
	public Father() {}
	public Father(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}//end
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}//disp() end
	
}//class end

class Son extends Father {
	
	public Son() {}
	public Son(String n, String a) {
		super(n, a);
	}//end
	
}//class end

class Daughter extends Father {
	
	String friend="절친";
	public Daughter() {}
	public Daughter(String n, String a) {
		super(n, a);
	}//end
	
}//class end




public class Test05_poly {

	public static void main(String[] args) {
		//상속관계에서의 다형성 Polylmorphism
		/*
		   - 상속 : extends(확장), implements(구현)
		   - 부모관점에서 형태가 여러가지
		   - 클래스들간의 형변환 작업이 용이함		 
		 */
		
		
		GregorianCalendar now=new GregorianCalendar();
		if(now.isLeapYear(2022)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		
		
		//다형성의 관계로 객체 생성  (자식이 부모집에 들어갈수 있다)
		Calendar cal=new GregorianCalendar();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		Integer inte=new Integer(3);
		Object obj=new Integer(5);
///////////////////////////////////////////////////////////////////
		
		
		//1)이반적인 방식의 객체 생성
		//->new연산자와 같이 생성자 함수를 이용한 객체 생성
		//->POJO (Plain Old Java Object) 방식
		
		//Father fa=new Father();
		//Son son=new Son();
		//Daughter daugh=new Daughter();
		
/////////////////////////////////////////////////////////////////////
		
		//2)다형성을 이용한 객체 생성
		//->자식클래스가 부모클래스에 대입 가능하다
		//Father fa=new Son();
		//Father fa=new Daughter();
		
		//부모클래스는 자식의 모양으로 바뀐다
		Father fa=new Son("손흥민", "영국");
		fa.disp();
				
		fa=new Daughter("김연아", "한국");
		fa.disp();
		
		System.out.println(fa.name);
		System.out.println(fa.addr);
		//System.out.println(fa.friend); 에러
		//->자식클래스가 새롭게 추가된 멤버는 다형성의 대상이 아니다
		
////////////////////////////////////////////////////////////////////		
		
		//3)부모클래스도 자식클래스에 대입할 수 있다
		//  (단, 자식의 모양으로 변환 후 가능하다)
		Father father=new Father();
		Son son=new Son();
		
		father=son; //자식은 부모에 대입 가능하다
		
		son=(Son)father; //부모도 자식에 대입 가능하지만, 데이터 손실과 예외가 발생 할 수도 있음.
		
		

	}//main() end
}//class end
