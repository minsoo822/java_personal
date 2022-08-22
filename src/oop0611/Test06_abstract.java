package oop0611;


abstract class Animal{ //추상클래스
	String name;
	void view() {
		System.out.println("Animal.view()...");
	}//end
	abstract void disp(); //추상메소드
}//class end


//추상클래스는 주로 부모클래스 역활만 한다
class Elephant extends Animal {
	//추상클래스를 상속받으면 반드시 추상메소드를 재정의(override) 해야한다
	@Override
	void disp() {
		System.out.println("Elephant.disp()...");
	}
}//class end


class Tuna extends Animal {
	//반드시 추상메소드를 재정의(override) 해야한다
	@Override
	void disp() {
		System.out.println("Tuna.disp()...");
	}
}//class end



public class Test06_abstract {

	public static void main(String[] args) {
		//추상클래스 Abstract class
		/*
		   - 미완성 클래스
		   - 추상메소드가 한개라도 있으면 추상클래스
		   - 추상메소드 : 함수에 기능 {}이 없는 메소드
		   - 추상메소드 선언 형식) 리턴형 함수명();
		   - 추상메소드와 일반메소드가 같이 선언할 수 있다
		*/
		
		//인터페이스 interface : 추상메소드만 가능하다
		
		
		//Animal ani=new Animal(); 에러. 추상클래스로는 직접 객체 생성할 수 없다
		
		
		Elephant jumbo=new Elephant();
		jumbo.view();
		jumbo.disp();
		
		Tuna nemo=new Tuna();
		nemo.view();
		nemo.disp();
		
		
		//추상클래의 다형성
		Animal ani=new Elephant();
		ani.disp();
		
		ani=new Tuna();
		ani.disp();
		
	
		
	}//main() end
}//class end
