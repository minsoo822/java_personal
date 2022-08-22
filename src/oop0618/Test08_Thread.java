package oop0618;


class MyThread3 implements Runnable {
	          //클래스이 부모가 인터페이스 implements (구현)
	          //인터페이스는 다중구현이 가능하다
	          //인터페이스 : 추상메소드만 가능하다
	          //추상메소드 : 함수의 기능 {}이 없다. 미완성메소드
	          //추상클래스 : 추상메소드와 일반 메소드가 혼합 가능하다
	
	private int num;
	private String name;
	
	public MyThread3() {}
	public MyThread3(int num, String name) {
		this.num=num;    
		this.name=name;
	}//end

	@Override
	public void run() {
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}//for end		
	}//run() end
	
}//class end



public class Test08_Thread {

	public static void main(String[] args) {
		//3) Runnable인터페이스를 이용한 쓰레드 구현
		/*
		   Interface Runnable{}
		   class Thread implements Runnable{}
		   class MyThread3 implements Runnable{}
		   
		   Runnable target=new MyThread3() 다형성		
		*/
		
		Thread t1=new Thread(new MyThread3(1000, "★"));
		Thread t2=new Thread(new MyThread3(1000, "★★"));
		Thread t3=new Thread(new MyThread3(1000, "★★★"));
		
		t1.start();
		t2.start();
		t3.start();	
		
		

	}//main() end
}//class end
