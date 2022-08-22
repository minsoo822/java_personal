package oop0521;

public class Test08_method {
	
	public static void test() {
		test(); //자신의 함수를 호출할 수 있다
	}//test() end
	
	public static long fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);
		}//if end
	}//fact() end
	/*
		if(4==0)
		else
			 4*fact(4-1)
			   if(3==0)
		       else
			        3*fact(3-1)
					  if(2==0)
					  else
			               2*fact(2-1)
							 if(1==0)
							 else
			 					 1*fact(1-1)
			 					   if(0==0) return1
	*/

	public static void test1(int a, int b) {
		System.out.println(a+b);
	}//test1() end
	
	public static void test2(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}//for end
	}//test2() end
	
	public static void test3(int a, int b) {
		System.out.println(a+b);
	}//test3() end
	
	public static void test4(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}//for end
			System.out.println();
		}//for end			
	}//test4() end
	
	public static void main(String[] args) {
		//1. 재귀적 함수 호출
		//->자신이 자신의 함수를 호출할 수 있다

		System.out.println(fact(4));
		
				
		//2. 전달값이 배열인 경우
		int[] su= {10, 20, 30};
		test1(su[0], su[2]); //10, 30 Call By Value 값에 의한 호출방식
		test2(su); 					//Call By Reference 참조에 의한 호출
		
		int[][] num= {
					    {1, 3, 5}
					   ,{2, 4, 6}
					 }; //2행 3열
		
		test3(num[0][0], num[1][2]); //1, 6
		test4(num);
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
