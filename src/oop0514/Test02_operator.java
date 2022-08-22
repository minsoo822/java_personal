package oop0514;

public class Test02_operator {

	public static void main(String[] args) {
		//대입연자
		int a=3;
		a=a+1;
		System.out.println(a); //4
		
		a+=1;
		System.out.println(a); //5
		
		a=a-2;
		System.out.println(a); //3
		
		a-=2;
		System.out.println(a); //3
		
		a*=5;
		System.out.println(a); //5
		
		a/=5;
		System.out.println(a); //1
		
		a%=3;
		System.out.println(a); //a=1%3
//////////////////////////////////////////////////////////////////
		
		
		System.out.println("-----------");
		
		//1증가 연산자
		int b=3;
		b=b+1;
		b+=1;
		b++;
		++b;
		System.out.println(b); //7
		
		
		//1감소 연산자
		int c=3;
		c=c-1;
		c-=1;
		c--;
		--c;
		System.out.println(c); //-1
		
		//1증감연산자는 계산식과 중복해서 사용하는 경우 주의!!
		int i=10, j=10;
		int x=++i;  //i=i+1
					//int x=i
		int y=j--;	
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
		System.out.println(y);
//////////////////////////////////////////////////////////
		
		System.out.println("--------------------------");
		
		//삼항연산자
		//->형식)  (조건) ? 참 : 거짓
		
		
		int n=3;
		System.out.println(n*-1); //이항
		System.out.println(-n);	  //단항
		
		
		String str=(5<3) ? "맞다" : "틀리다";
				 // false
		System.out.println(str);
		
		
		//문1) 절대값(무조건 양수)을 구하시오
		int m=-5;
		int result=(m<0) ? -m   :   m;
				 //-5<0    -1*-5
		
		System.out.println(m+" 절대값: "+result);
		
		
		//문2) 세개의 수 중에서 가장 큰 수를 구하시오
		int p=3, q=9, r=7;
		
		int max=(p<q) ? q : p;
			  // 3<9    9
		max=(max<r) ? r : max;
		   // 9 <7         9
		
		System.out.println(p + "," + q + "," + r + "중 최대값:" + max);
/////////////////////////////////////////////////////////////////////
		
		System.out.println("---------------------");
		
		//Math 수학 관련 클래스
		
		//절대값
		System.out.println(Math.abs(-3)); //-3
		
		//큰값
		System.out.println(Math.max(5, 7)); //7
		System.out.println(Math.max(2, Math.max(4, 6)));//6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end

}//class end
