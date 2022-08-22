package oop0618;

public class Test01_format {

	public static void main(String[] args) {
		//출력서식
		/*
		   정수형    %d
		   실수형    %f
		   문자형    %c
		   문자열형   %s
		   줄바꿈		\n
		*/
		
		//형식) System.out.printf("출력서식", 값);
		
		System.out.printf("%d %d %d\n", 10, 20, 30);
		System.out.printf("나이:#%d#\n",123);
		System.out.printf("나이:#%5d#\n",123);
		System.out.printf("나이:#%-5d#\n",123);
		
///////////////////////////////////////////////////////////		
		
		System.out.printf("%f %f\n", 1.2, 3.4);
		System.out.printf("키:%f\n", 165.7);
		System.out.printf("키:#%9.2f#\n", 165.7);
		System.out.printf("키:#%-9.2f#\n",165.7);
		System.out.printf("키:#%.2f#\n",  165.7);
		
//////////////////////////////////////////////////////////		
		
		System.out.printf("%c\n",'A');
		System.out.printf("#%-5c#\n",'B');

		System.out.printf("%s\n","APPLE");
		System.out.printf("#%-5s#\n","HI");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
