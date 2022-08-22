package oop0430;

public class Test03_print {

	public static void main(String[] args) {
		//출력
		
		//명령어에 사용되는 문자를 단순 기호로 접근하는 경우 \ 와 함께 사용
		System.out.println("\"");
		System.out.println("\\");
		
		System.out.print("서울");
		System.out.print("제주");
		System.out.print("부산");
		
		System.out.println();//줄바꿈
		
		System.out.println("Java");
		System.out.println("Python");
		
		System.out.println(1+3);     //4
		System.out.println(1+"3");   //13
		System.out.println("1"+3);   //13
		System.out.println("1"+"3"); //13
		System.out.println("1+3");   //1+3
		
		
		
	}//main() end
}//class end
