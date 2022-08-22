package oop0528;

import java.util.GregorianCalendar;
import java.lang.*; //자바의 기본 팩키지. 생략가능하다


public class Test05_api {

	public static void main(String[] args) {
		//기본 API
		
		//1. 달력 관련 클래스
		GregorianCalendar cal=new GregorianCalendar();
		System.out.println(cal.get(5));//오늘날짜 28
		System.out.println(cal.get(2));//월 		4
		System.out.println(cal.get(2)+1);
		System.out.println(cal.get(1));//년도  	2022
		
		//2022년이 윤년인지 확인하시오
		if(cal.isLeapYear(2022)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		
		
		//문)서기1년~서기2022년까지 윤년의 갯수를 구하시오
		int count=0;
		for(int y=1; y<=2022; y++) {
			if(cal.isLeapYear(y)) {
				count++;
			}//if end
		}//for end
		
		System.out.println(count);
		
//////////////////////////////////////////////////////////////////////////
		
		//2. Math 수학 관련 클래스
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));    //3	절대값
		System.out.println(Math.ceil(1.3));	 //2.0	소수점 올림
		System.out.println(Math.floor(2.7)); //2.0	소수점 버림
		System.out.println(Math.round(3.8)); //4	반올림
		
		//난수 random값
		//난수의 범위 0.0<= r < 1.0
		//System.out.println(Math.random());
		//System.out.println((int)(Math.random()*2)); //0 1
		//System.out.println((int)(Math.random()*4)); //0 1 2 3
		//System.out.println((int)(Math.random()*6)); //0 1 2 3
		
		//문) 주사위 1~6사이의 값만 구하시오
		System.out.println((int)(Math.random()*6)+1);
		
////////////////////////////////////////////////////////////////////////////////
		
		//3. Integer 정수형 관련 클래스
		Integer intel1=new Integer(3);
		Integer intel2=new Integer("5");
		
		System.out.println(intel1.doubleValue()); //3.0
		System.out.println(intel2.byteValue());   //byte형 5 으로 변환
		
		System.out.println(Integer.toBinaryString(5));//"101" 2진수변환
		System.out.println(Integer.toOctalString(10));//"12"  8진수변환
		System.out.println(Integer.toHexString(12));  //"c"   16진수변환
		
		//★★★ "123" -> 123 변환 함수
		int num=Integer.parseInt("123"); //123
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
