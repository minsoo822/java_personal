package backjoon.step1;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		
		//Scanner 클래스의 메서드
		//Scanner() 메서드는 각자 언제 사용될까?
//		메서드			기능
//		next()			String을 읽음. 단, 띄어쓰기 뒷부분은 읽지 않음.
//		nextLine()		String을 읽음. 띄어쓰기를 포함하여 한 줄(즉, Enter를 치기 전까지)을 읽음.
//		nextInt()		int 를 읽음.
//		nextBoolean()	boolean 을 읽음
//		nextByte()		byte 를 읽음
//		nextShort()		short 를 읽음
//		nextLong()		long 을 읽음
//		nextFloat()		float 을 읽음
//		nextDouble()	double 을 읽음
		
		//참조
		//https://velog.io/@cse_pebb/Java-Scanner-%EB%A9%94%EC%84%9C%EB%93%9C-%EC%B4%9D%EC%A0%95%EB%A6%AC
		
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}

}
