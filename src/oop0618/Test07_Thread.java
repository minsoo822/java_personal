package oop0618;


class MyThread2 extends Thread {
	           //Ŭ������ �θ� Ŭ����    extends
	           //Ŭ������ �θ� �������̽� implements
	           //Ŭ�������� ����� ���ϻ�Ӹ� �����ϴ�
	           //�����带 �����Ϸ��� ThreadŬ������ ��ӹ޾ƾ� �Ѵ�
	
	private int num;
	private String name;
	
	public MyThread2() {}
	public MyThread2(int num, String name) {
		this.num=num;
		this.name=name;
	}//end
	
	@Override //<-������(�������� �޼ҵ带 �ٽ� ����)
	public void run() {
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}//for end
	}//run() end

}//class end



public class Test07_Thread {

	public static void main(String[] args) {
		//2) ThreadŬ������ ����� ���
		//->start()�� ������ �����ڿ� ���
		//->������ �����ڰ� run()�޼ҵ带 ���������� �������� �ʰ�
		//->��ü�� ��ȯ�ϸ鼭 ��ü�ȿ� �ִ� run()�޼ҵ带 ȣ���Ѵ�
		
		MyThread2 t1=new MyThread2(1000, "��");
		MyThread2 t2=new MyThread2(1000, "�ڡ�");
		MyThread2 t3=new MyThread2(1000, "�ڡڡ�");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}//main() end
}//class end
