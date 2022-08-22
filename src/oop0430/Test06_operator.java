package oop0430;

public class Test06_operator {

	public static void main(String[] args) {
		//연산자 Operator
		//->이식성이 풍부하다
		//->최우선 연산자  : ()
		//->후순위 연산자  : = 대입연산자
		//->연산자 우선순위 :  산술 -> 비교 -> 논리
		
		//1. 산술연산자
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3); //1 몫
		System.out.println(5%3); //2 나머지

		System.out.println(3/5); //0
		System.out.println(3%5); //3
		
		System.out.println(3.0/5.0); //0.6
		System.out.println(3/5.0);   //0.6
		System.out.println(3.0/5);   //0.6
		System.out.println(3/5.);    //0.6
		
///////////////////////////////////////////////////////////
		
		//2.비교(관계)연산자
		//->결과값이 boolean형으로 반환한다
		System.out.println(5<3);
		System.out.println(5>3);
		System.out.println(5<=3);
		System.out.println(5>=3);
		System.out.println(5!=3); //같지 않다
		System.out.println(5==3); //같다
		
///////////////////////////////////////////////////////////
				
		//3.논리연산자
		//->조건이 2개이상이 오는 경우 전체적으로 판단
		//->결과값이 boolean형으로 반환된다
		//->AND, OR, NOT
		
		//1)AND
		//->논리곱 연산자
		//->그리고, ~이면서
		//->모든 조건이 true일때 true로 판단
		//-> &&
		System.out.println(3<5 && 2>4);
		               //  true   false
		               //  false
		
		//2)OR
		//->논리합 연산자
		//->또는, ~이거나
		//->조건이 하나라도 true이면 true로 판단
		//-> ||
		System.out.println(3<5 || 2>4);
		               //  true   false
		               //  true
		
		//3)NOT 연산자
		//-> 논리 부정 연산자
		//-> ~아니라면
		//-> !
		boolean flag=false;
		System.out.println(!flag);
		
		

	}//main() end
}//class end
