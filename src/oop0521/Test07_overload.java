package oop0521;

public class Test07_overload {

	public static void hap(int a, int b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(double a, double b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(String a, String b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(int a) {
		System.out.println(a);
	}//hap() end
	
/*	에러. 함수의 리턴형은 메소드 오버로딩의 전제조건이 아니다
	public static int hap(int a) {}
*/	
	
	public static void main(String[] args) {
		//Method Overloading 함수명 중복 정의
		//->함수명을 중복해서 선언할수있다
		
		//메소드 오버로딩의 전재조건
		//->매개변수의 자료형이 달라야 한다
		//->매개변수의 갯수가 달라야 한다
		
		hap(3, 5);
		hap(2.4, 5.6);
		hap("JAVA", "Python");
		hap(7);
		
		

	}//main() end
}//class end
