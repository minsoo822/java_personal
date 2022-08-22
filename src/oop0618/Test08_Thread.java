package oop0618;


class MyThread3 implements Runnable {
	          //Ŭ������ �θ� �������̽� implements (����)
	          //�������̽��� ���߱����� �����ϴ�
	          //�������̽� : �߻�޼ҵ常 �����ϴ�
	          //�߻�޼ҵ� : �Լ��� ��� {}�� ����. �̿ϼ��޼ҵ�
	          //�߻�Ŭ���� : �߻�޼ҵ�� �Ϲ� �޼ҵ尡 ȥ�� �����ϴ�
	
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
		//3) Runnable�������̽��� �̿��� ������ ����
		/*
		   Interface Runnable{}
		   class Thread implements Runnable{}
		   class MyThread3 implements Runnable{}
		   
		   Runnable target=new MyThread3() ������		
		*/
		
		Thread t1=new Thread(new MyThread3(1000, "��"));
		Thread t2=new Thread(new MyThread3(1000, "�ڡ�"));
		Thread t3=new Thread(new MyThread3(1000, "�ڡڡ�"));
		
		t1.start();
		t2.start();
		t3.start();	
		
		

	}//main() end
}//class end
