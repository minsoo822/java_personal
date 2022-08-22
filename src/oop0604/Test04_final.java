package oop0604;

/*
final class Animal{} //종단클래스. 후손클래스를 만들 수 없다
class Elephant extends Animal {} 에러.
*/

class Fruit{
	void view() {}
	final void disp() {}
}//class end

class Apple extends Fruit{
	
	@Override		//<- annotation
	void view() {}	//<- 상속 받은 함수를 재정의(리폼, 오버라이드)
	
	/* 에러. 상속받은 final 메소드는 더이상 오버라이드 할 수 없다
		@Override
		void disp() {}
	*/
	
}//class end


public class Test04_final {

	public static void main(String[] args) {
		//final 마지막
		//->변수, 함수, 클래스
		
		int a=3;
		a=5;
		System.out.println(a);
		
		
		final int b=2; //final (변수를 상수화)
		//b=4; 에러. final변수는 다른값으로 변할 수 없다
		

	}//main() end
}//class end
