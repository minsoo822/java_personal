package oop0430;

public class Test07_quiz {

	public static void main(String[] args) {
		//연습문제
		
		//문1)임의의 정수가 짝수(2의배수)인지 확인하시오
		int a=4;
		System.out.println(a%2==0);
		               //  4%2
		               //  0  ==0
		
		System.out.println(a%2!=1);
		              //   4%2
		              //   0  !=1
		
		//문2)임의의 정수가 4의배수인지 확인하시오
		int b=7;
		System.out.println(b%4==0);
		               //  7%4
		               //  3  ==0
		
		//문3)해당년도 윤년인지 확인하시오
		int year=2022;
		System.out.println(year%4==0);
		
		
		//문4)임의의 정수값이 2의 배수이면서 5의 배수인지 확인하시오
		int c=6;
		System.out.println(c%2==0 && c%5==0);
		               //  6%2       6%5
		               //  0  ==0    1  ==0
		               //  true      false
		               //  false
		
		//문5)성별코드가 1 또는 3인지 확인하시오
		int code=1;
		System.out.println(code==1 || code==3);
		
		

	}//main() end
}//class end
