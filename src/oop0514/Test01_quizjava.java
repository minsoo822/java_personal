package oop0514;

public class Test01_quizjava {

	public static void main(String[] args) {
		//Object Oriented Program 객체지향프로그램
		
		//문제) 지폐의 객수를 구하시오
		int money=53460;
		/*
		    출력결과
		    만원 5 장
		    천원 3 장
		    백원 4 장
		    십원 6 장
		 */
		
		//나머지연산자
		System.out.println(money/10000); //몫5
		System.out.println(money%10000); //나머지 3460
		
		int m=money/10000;
		System.out.println("만원 : " + m + "장");
		
		money=money%10000; //3460
		int c=money/1000; //3
		System.out.println("천원 : " + c + "장");
		
		money=money%1000; //460
		int b=money/100; //4
		System.out.println("백원 : " + b + "장");
		
		money=money%100; //60
		int s=money/10; //6
		System.out.println("십원 : " + s + "장");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
