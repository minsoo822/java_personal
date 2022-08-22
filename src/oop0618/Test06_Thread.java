package oop0618;


class MyThread1 {
	//������� field
	private int num;
	private String name;
	
	//�������Լ� constructor
	public MyThread1() {}  //�⺻������ default constructor
	public MyThread1(int num, String name) { //�������Լ� overloading �Լ� �ߺ� ����
		this.num=num;   //this.�������=�Ű����� parameter
		this.name=name;
	}//end
	
	//����Լ� method
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
		//Thread Ŭ����
		//->�ϳ��� ���α׷��̳� �ϳ��� �޼ҵ尡 CPU �ڿ��� ���� �����ϴ� ���� ���� �� �ִ�
		//->��)ä��, ����
		//->ThreadŬ����, Runnable�������̽�
		
		
		//1)�����带 ������� ���� ���
		MyThread1 t1=new MyThread1(1000, "��");
		MyThread1 t2=new MyThread1(1000, "�ڡ�");
		MyThread1 t3=new MyThread1(1000, "�ڡڡ�");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}//main() end
}//class end
