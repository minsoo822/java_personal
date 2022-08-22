package oop0514;

public class Test08_continue {

	public static void main(String[] args) {
		//break와 continue
		
		//1.break문
		for(int a=1; a<10; a=a+1) {
			if(a==5) {
				break;//반복문을 빠져나옴
			}//if end
			System.out.print(a);
		}//for end
		System.out.println();//줄바꿈
		
		
		
		
		//2.continue문
		for(int a=1; a<10; a=a+1) {			
			if(a==5) {
				continue;//반복문을 계속 실핼(U턴)
			}//if end
			System.out.print(a);
		}//for end
		
		
	}//main() end
}//class end
