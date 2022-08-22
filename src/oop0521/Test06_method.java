package oop0521;											

public class Test06_method {

	//리턴값의 자료형을 void자리에 쓴다
	public static int test1(int a, int b) {
		int sum=a+b;
		return sum; //리턴값은 1개 값만 리턴된다       	*리턴값을 2개로 하고싶으면 배열
	}//test1() end
	
	public static String test2(int a) {
		if(a%2==0) {
			return "짝수";
		}else {
			return "홀수";
		}//if end
	}//test2() end
	
	public static long fact(int a) {
		long gop=1;
		for(int f=a; f>=1; f--) {
			gop=gop*f;
		}//for end
		return gop;
	}//fact() end
	
	public static boolean leap(int y) {
		if(y%4==0 && y%100!=0 || y%400==0) {
			return true;
		}else {
			return false;
		}//if end
	}//leap() end
	
	public static void main(String[] args) {
		//3. 리턴값이 있는 경우
		
		int result=test1(3, 5);
		System.out.println(result);
		System.out.println(test1(2,4));
		
		
		String str=test2(6);
		System.out.println(str);
		System.out.println(test2(7));
			

		
		//문1) 4팩토리얼값을 구하시오 (4*3*2*1);
		long gop=fact(4);
		System.out.println(gop);
		
				
		
		//문2) 윤년, 평년을 구하시오
		if(leap(2002)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
