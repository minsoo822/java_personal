package oop0514;

public class Test03_conversion {

	public static void main(String[] args) {
		//자료형변환 Datatype Conversion
		
		//주의)정수값으로 계산하면 정수형으로만 변환된다.
		System.out.println(3/5);	 //0
		System.out.println(3.0/5.0); //0.6
		System.out.println(3/5.0);	 //0.6
		System.out.println(3.0/5);	 //0.6
		System.out.println(3/5.); 	 //0.6
		
		
		//1. 강제형 변환(cast연산자)
		//->필요한 곳에서 일시적으로 변환
		//->(자료형)값
		System.out.println((int)1.3);
		System.out.println((int)2.4+(int)3.7);//2+3
		System.out.println((int)(2.4+3.7));   //(int)(6.1)
		
		System.out.println((double)5);
////////////////////////////////////////////////////////////////
		
		
		//int a=3.0; 에러. 실수값이 정수형으로 대립할수 없다
		
		//2. 자동형 변환
		//정수형 : byte < short < int < long
		//실수형 : float < double
		byte b=2;
		int i=b;  //b변수는 자동을 int형화 된다.
		long l=i; //i변수는 자동으로 long형화 된다.
		//b=l; 에러
		
		float f=3.4f;
		double d=f;
/////////////////////////////////////////////////////////////
		
		
		//int와 char간의 형변환
		System.out.println(65);
		System.out.println((char)65); //A
		
		System.out.println('a');
		System.out.println((int)'a'); //97
		
		//ASCII코드값이 존재하므로, int형과 char형의 강제형변환이 가능하다
		System.out.println('A'<'a'); //true
		System.out.println((char)('A'+1));//B
		
		
		
		
		
		
		

	}//main() end

}//class end
