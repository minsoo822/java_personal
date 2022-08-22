package oop0618;


class MyThread1 {
	//멤버변수 field
	private int num;
	private String name;
	
	//생성자함수 constructor
	public MyThread1() {}  //기본생성자 default constructor
	public MyThread1(int num, String name) { //생성자함수 overloading 함수 중복 정의
		this.num=num;   //this.멤버변수=매개변수 parameter
		this.name=name;
	}//end
	
	//멤버함수 method
	public void start() {
		run();
	}//start() end
	
	public void run() {
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}//for end
	}//run() end
	
}//class end



public class Test06_Thread {

	public static void main(String[] args) {
		//Thread 클래스
		//->하나의 프로그램이나 하나의 메소드가 CPU 자원을 전부 점유하는 것을 막을 수 있다
		//->예)채팅, 예매
		//->Thread클래스, Runnable인터페이스
		
		
		//1)쓰레드를 사용하지 않은 경우
		MyThread1 t1=new MyThread1(1000, "★");
		MyThread1 t2=new MyThread1(1000, "★★");
		MyThread1 t3=new MyThread1(1000, "★★★");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}//main() end
}//class end
