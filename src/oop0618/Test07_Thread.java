package oop0618;


class MyThread2 extends Thread {
	           //클래스의 부모가 클래스    extends
	           //클래스의 부모가 인터페이스 implements
	           //클래스간의 상속은 단일상속만 가능하다
	           //쓰레드를 구현하려면 Thread클래스를 상속받아야 한다
	
	private int num;
	private String name;
	
	public MyThread2() {}
	public MyThread2(int num, String name) {
		this.num=num;
		this.name=name;
	}//end
	
	@Override //<-재정의(물려받은 메소드를 다시 리폼)
	public void run() {
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}//for end
	}//run() end

}//class end



public class Test07_Thread {

	public static void main(String[] args) {
		//2) Thread클래스를 사용한 경우
		//->start()가 쓰레드 관리자에 등록
		//->쓰레드 관리자가 run()메소드를 집중적으로 실행하지 않고
		//->객체를 순환하면서 객체안에 있는 run()메소드를 호출한다
		
		MyThread2 t1=new MyThread2(1000, "★");
		MyThread2 t2=new MyThread2(1000, "★★");
		MyThread2 t3=new MyThread2(1000, "★★★");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}//main() end
}//class end
