package oop0604;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test09_Calendar {

	public static void main(String[] args) {
		//Calendar 클래스
		//날짜 관련 클래스 (년월일시분초)
		/*
		 	class Calendar{}
		 	class GregorianCalendar extends Calendar{} 	     //오늘 날짜 가져오기
		 */
		
		GregorianCalendar now=new GregorianCalendar();
		
		System.out.println(now.get(1));     				 //2022
		System.out.println(now.get(Calendar.YEAR)); 		 //2022
		System.out.println(now.get(Calendar.MONTH));		 //5
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE)); 		 //4
		
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK));   //요일 (1일 2월 ... 7토)
		System.out.println(now.get(Calendar.HOUR_OF_DAY));   //24시간 기준
		
		
		
		//해당날짜에 1일 더하기
		now.add(Calendar.DATE, 1);
		System.out.println(now.get(Calendar.DATE));
		
		//해당날짜에 10일 뺴기
		now.add(Calendar.DATE, -10);
		System.out.println(now.get(Calendar.DATE));
		
		//해당날짜에 5달 더하기
		now.add(Calendar.MONTH, 5);
		System.out.println(now.get(Calendar.MONTH));
				
		//해당날짜에 3년 빼기
		now.add(Calendar.YEAR, -3);
		System.out.println(now.get(Calendar.YEAR));
		
		
		//now값을 새로운 날짜 재구성하기
		//2002년 12월31일
		now.set(Calendar.YEAR, 2022);
		now.set(Calendar.MONTH, Calendar.DECEMBER);
		now.set(Calendar.DATE, 31);
		
		

	}//main() end
}//class end
