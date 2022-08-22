package oop0611;


class Sungjuk { //접근제어 package 생략되어 있음
	            //Sungjuk 클래스는 oop0611팩키지내에서만 접근가능하다
	//멤버변수 field
	String nama;
	int kor, eng, mat;
	int aver;
	
	//생성자 함수 constructor
	//->클래스명과 동일한 함수
	//->new연산자로 객체생성시 필요한다
	public Sungjuk() { //기본생성자함수 default constructor
		//Sungjuk("손흥민");에러
		this("손흥민");//자신의 생성자함수를 호출할떄
	}//end
	
	//생성자 함수도 오버로딩이 가능하다
	public Sungjuk(String name) {
		
	}//end
	
	public Sungjuk(int k, int e, int m){
		this("오필승");
		this.aver=(k+e+m)/3;
		//this
	}//end
	
	public Sungjuk(String n, int k, int e, int m) {
		calc();//생성자 함수는 일반 메소드
	}//end
	
	
	
	//멤버함수 method
	public void calc( ) {
		//this("코리아", 10, 20, 30); 에러. 일반 메소드에서 생성자 함수를 호출할 수 없다
	}//calc() ens
	
	
	
	
	
}//class end




public class Test01_this {

	public static void main(String[] args) {
		//this() : 생성자함수가 자신의 생성자 함수를 호출할 깨
		//this   : 멤버변수와 일반변수를 수분하기 위해. this.멤버변수
		
		

		

	}//main end
}//class end
