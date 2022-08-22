package oop0521;

public class Test05_method {
	
	//메소드(함수) 작성 영역
	//함수 정의(작성)
	
	public static void test1() { //void 리턴값이 없다(무치형)
		System.out.println("JAVA");
	}//test1() end
	
	public static void test2() {
		System.out.println("Python");
	}//test2() end
	
	public static void test3() {
		System.out.println("HTML");
		return; //함수를 호출한 시점으로 되돌아 간다
		  		//마지막 return은 생략가능하다
	}//test3() end
	
	public static void test4(int a) { //a는 매개변수(parameter)
		System.out.println(a);
	}//test4() end
	
	public static void test5(int a, int b, int c) { //매개변수의 자료형은 생략할 수 없다
		System.out.println(a+b+c);
	}//test5() end	
	
	public static void test6(double a, double b) {
		System.out.println(a+b);
	}//test6() end
	
	public static void test7(char ch, int a) {
		for(int n=1; n<=a; n++) {
			System.out.println(ch);
		}//for end
	}//test7() end
	
	public static void main(String[] args) {
		//Method 메소드 ★★★★★ 
		//함수, funcion
		//->일정한 기능을 갖고 있음
		/*
		  ● 식별자
		  	- 프로젝트명 basicJava
		  	- 팩키지명  oop0521
		  	- 클래스명  Test05_method
		  	- 변수명, 함수명
		 
		  ● Method 함수
		    - 함수  작성시 고려사항 : 매개변수(parameter), 리턴값
		    - 함수를 작성하고, 그 함수를 호출함으로써 실행한다
		    - 함수선언(정의) 형식 : 리턴형 함수명(){}
		    - test() 함수, test 변수				
		 */
		
		
		//1. 전달값(argument value)이 없는 경우
		test1(); //함수호출
		test2();
		test1();
		test1();
		test3();
		
		
		
		//2. 전달값이 있는 경우
		test4(10);
		test4(30);
		test4(50);
		
		test5(2, 4, 6);
		test5(3, 5, 7);
		
		
		test6(1.2, 3.4);
		
		test7('#', 100);
		
		
	
	}//main() end (메인함수)
}//class end
