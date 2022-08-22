package oop0604;


class Sawon{ //접근제어 package생략되어 있음
	//멤버변수 field
	String sabun; //사원번호
	String name;  //이름
	int pay;	  //급여
	
	//생성자함수 constructor
	public Sawon() {} //기본생성자함수 default constructor
	public Sawon(String sabun, String name, int pay) {
		this.sabun=sabun; //this.멤버변수=지역변수
		this.name=name;
		this.pay=pay;
	} //함수 중복 정의(overloadin)
	
	//멤버함수 method
	
	//static 변수
	static String COMPANY="(주)이젠IT아카데미";
	static double TAX=0.03;
	static int SUDANG=10;
	//static 함수
	static void line() {
		System.out.println("-----------------------------");
	}//line() end
	
}//class end



//////////////////////////////////////////////////////
public class Test03_static {

	public static void main(String[] args) {
		//static변수의 연산
		
		//1)static특징이 반영되지 않은 경우(비추천)
		Sawon one=new Sawon("1001", "무궁화", 100);
		//세금=급여*0.03
		int myTax=(int)(one.pay*one.TAX);
		//총지급액=(급여=수당)-세금
		int total=(one.pay+one.SUDANG)-myTax;
		
		//출력하기
		System.out.println("회사명 : " + one.COMPANY);
		System.out.println("사번 : " + one.sabun);
		System.out.println("이름 : " + one.name);
		System.out.println("급여 : " + one.pay);
		System.out.println("수당 : " + one.SUDANG);
		System.out.println("세금 : " + myTax);
		System.out.println("총지급액 : " + total);
		one.line();
		
//////////////////////////////////////////////////////////////////////////		
	
		//2)static특징이 반영된 경우(추천)
		//->클래스명.변수, 클래스명.함수() 접근한다
		Sawon two=new Sawon("1003", "오필승", 200);
		myTax=(int)(two.pay*Sawon.TAX);
		total=(two.pay+Sawon.SUDANG)-myTax;
		
		//출력하기
		System.out.println("회사명 : " + Sawon.COMPANY);
		System.out.println("사번 : " + two.sabun);
		System.out.println("이름 : " + two.name);
		System.out.println("급여 : " + two.pay);
		System.out.println("수당 : " + Sawon.SUDANG);
		System.out.println("세금 : " + myTax);
		System.out.println("총지급액 : " + total);
		Sawon.line();
		
/////////////////////////////////////////////////////////////////////
		
		//3)static변수의 연산
		//->생성도 1번, 소멸도 1번
		//->static변수의 연산은 계속 이어진다(continue)
		
		Sawon son =new Sawon("3001", "손흥민", 300);
		Sawon park=new Sawon("4001", "박지성", 400);
		
		son.SUDANG=son.SUDANG+1;           //10+1
		System.out.println(son.SUDANG);
		
		park.SUDANG=park.SUDANG+1;		   //11+1
		System.out.println(park.SUDANG);
		
		Sawon.SUDANG=Sawon.SUDANG+1; 	   //12+1
		System.out.println(Sawon.SUDANG);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
