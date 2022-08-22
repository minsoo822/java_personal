package oop0514;

public class Test07_for {

	public static void main(String[] args) {
		//반복문
		//for, wile, do~wile
		//break	    : 반복문을 빠져나옴
		//continue	: 반복문을 계속 실행
		//무한 LOOP	: 끝이 없는 반복
		/*
		  	-for문 형식
		  	 for(시작값; 종료값; 증감) {반복하고자 하는 명령어들}  			 
		 */
		
		
		//1. 증가에 따른 반복
		for(int a=1; a<=3; a=a+1) {
			
			System.out.println("JAVA");
		
		}//for end
		/*
			a=1  1<=3 JAVA  a=1+1
				 2<=3 JAVA  a=2+1
				 3<=3 JAVA  a=3+1
				 4<=3 
		 */
		
		
		//2. 감소에 따른 반복
		for(int b=3; b>=1; b=b-1) {
			System.out.println("Python" + b);
			
		}//for end
		/*
			b=3 3>=1 Python3 b=3-1
				2>=1 Python2 b=2-1
				1>=1 Python1 b=1-1
				0>=1
		
		*/
		
		
		
		//3.유효범위(SCOPE)
		//->특정 변수나 객체가 생존할 수 있는 범위
		for(int c=1; c<=5; c+=1) {
			System.out.println("KOREA");
		}//for end
		
		//for문 안에 선언된 c변수는 for문 안에서만 유효하다.
		//System.out.println(c); 에러
		
	
		int d=0; //변수가 선언된 시점에서부터 그 아래에서는 사용 가능하다
		for(d=1; d<=5; d++) {
			System.out.println("SEOUL");
		}//for end
		
		System.out.println(d);//6
		
		
		/* 참조
		b=3 3>=1 Python3 b=3-1
			2>=1 Python2 b=2-1
			1>=1 Python1 b=1-1
			0>=1
	
	*/
		
		
		
	}//main() end
}//class end
