package oop0514;

public class Test09_while {

	public static void main(String[] args) {
		//1. while 반복문
		//-> 형식) while(조건) {조건이 true이면 수행}
		//-> while(true){} 무한LOOP
		//-> for(;;){}     무한LOOP
		
		int a=1;
		while(a<=3) {
			System.out.println("JAVA");
			a=a+1;
		}//while end
		/*
		 	while(1<=3) {JAVA a=1+1}
		 	while(2<=3) {JAVA a=2+1}
		 	while(3<=3) {JAVA a=3+1}
		 	while(4<=3) 
		 */
		
		int b=1;
		while(true) {
			System.out.println("KOREA");
			b=b+1;
			if(b==5) {
				break; //반복문 빠져나옴
			}			
		}

//////////////////////////////////////////////////////////
		
		
		
		//2 do~wile 반복문
		/*
		   do{
		   		조건이 true이면 수행
		   }while(조건);
		   
		*/
		
		int c=1;
		do {
			System.out.println("Python");
			c=c+1;
		}while(c<=3);
		/*
		
		
		
		
		*/
		
		

		
	}//main() end
}//classend
