package oop0514;

public class Test10_quiz {

	public static void main(String[] args) {
		//반복문 연습문제

		//문1) 4단을 출력하시오
		/*
			4 * 1 = 4
			4 * 2 = 8			
			   ...
			4 * 9 = 36
		*/
		
		int dan=4;
		for(int i=1; i<=9; i=i+1) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}//for end		
		
		
		
		
		//문2) 1~3사이의 값을 전부 더하시오(누적의 합)
		//-> 1+2+3
		int hap=0;
		for(int a=1; a<=3; a=a+1) {
			hap=hap+a; //hap+=a
		}//for end
		
		System.out.println(hap);
		/*
			a=1  1<=3  hap=0+1  a=1+1
			 	 2<=3  hap=1+2  a=2+1
			 	 3<=3  hap=3+3  a=3+1
			 	 4<=3	
		 */
		
		
		
		//문3) 4팩토리얼값을 구하시오(누적의 곱)
		//-> 4*3*2*1
		long gop=1;
		for(int a=4; a>=1; a=a-1) {
			gop=gop*a;
		}//for end
		
		System.out.println(gop);
		
		
		
		//문4) 1~5중에서 짝수의 갯수를 구하시오 (조건을 알아야한다.)
		int count=0;
		for(int a=1; a<=5; a=a+1) {
			if(a%2==0) {
				count=count+1;
			}//if end
		}//for end
		System.out.println(count);
		/*
			a=1 1<=5 {if(1%2==0)}
				2<=5 {if(2%2==0) count=0+1}
				3<=5 {if(3%2==0)}
				4<=5 {if(4%2==0) count=1+1}
				5<=5 {if(5%2==0)}
				6<=5 		
		 */
		
		
		
		//문5) x값이 10으로부터 x를 여러번 뺀 후, 결과값이 음수가 되면 x를 몇번 뺐는가를 구하시오
		/*
			10-3=7
			 7-3=4
			 4-3=1
			 1-3=-2		
		*/
		
		int x=3;
		int num=10;
		int cnt=0;
		
		while(true) { //무한LOOP
			cnt=cnt+1;
			num=num-x;
			if(num<0) {
				break;
			}//if end
		}//while end
		
		System.out.println(cnt);
		
		
		
		
		
		//과제) 두수 사이의 합을 구하시오
		//     2+3+4+5
		//	   5+4+3+2
		int start=2;  //int start=5;
		int end=5;	  //int end=2;
		
		long happ=0; //결과값
		
		if(start>end) { //swap 값을 서로 교환
			int tmp=start;
			start=end;
			end=tmp;
		}//if end
		
		for(int a=2; a<=5; a=a+1) {
			happ=happ+a; //happ+=a
		}//for end
		
		System.out.println(happ);
		
		
		
		
		
		
		
	

		
		
		
	}//main() end
}//class end
