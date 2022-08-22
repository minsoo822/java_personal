package oop0430; //<-현재 클래스가 저장되어 있는 팩키지
                 //<-한번만 올수 있다

public class Test04_variable {

	public static void main(String[] args) {
		//상수와 변수
		//<-값을 표현하는 형태
		
		//1. 상수 constant
		//->고정 불변의 값
		System.out.println(3);
		System.out.println(-4);
		System.out.println(1.2);
		System.out.println("JAVA");
		
		
		//2. 변수 variable
		//->변하는 값
		//->변수는 자료형을 한번은 선언하고 사용한다
		//->형식) 자료형 변수명
		//->대입연산자(=)로 변수에 값을 저장한다
		
		int a=5;
		System.out.println(a);   //변수
		
		a=7;
		System.out.println(a);
		
		System.out.println(a-3);
		
		System.out.println("a"); //문자열 상수
		
		
		
	}//main() end
}//class end
