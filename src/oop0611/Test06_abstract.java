package oop0611;


abstract class Animal{ //�߻�Ŭ����
	String name;
	void view() {
		System.out.println("Animal.view()...");
	}//end
	abstract void disp(); //�߻�޼ҵ�
}//class end


//�߻�Ŭ������ �ַ� �θ�Ŭ���� ��Ȱ�� �Ѵ�
class Elephant extends Animal {
	//�߻�Ŭ������ ��ӹ����� �ݵ�� �߻�޼ҵ带 ������(override) �ؾ��Ѵ�
	@Override
	void disp() {
		System.out.println("Elephant.disp()...");
	}
}//class end


class Tuna extends Animal {
	//�ݵ�� �߻�޼ҵ带 ������(override) �ؾ��Ѵ�
	@Override
	void disp() {
		System.out.println("Tuna.disp()...");
	}
}//class end



public class Test06_abstract {

	public static void main(String[] args) {
		//�߻�Ŭ���� Abstract class
		/*
		   - �̿ϼ� Ŭ����
		   - �߻�޼ҵ尡 �Ѱ��� ������ �߻�Ŭ����
		   - �߻�޼ҵ� : �Լ��� ��� {}�� ���� �޼ҵ�
		   - �߻�޼ҵ� ���� ����) ������ �Լ���();
		   - �߻�޼ҵ�� �Ϲݸ޼ҵ尡 ���� ������ �� �ִ�
		*/
		
		//�������̽� interface : �߻�޼ҵ常 �����ϴ�
		
		
		//Animal ani=new Animal(); ����. �߻�Ŭ�����δ� ���� ��ü ������ �� ����
		
		
		Elephant jumbo=new Elephant();
		jumbo.view();
		jumbo.disp();
		
		Tuna nemo=new Tuna();
		nemo.view();
		nemo.disp();
		
		
		//�߻�Ŭ���� ������
		Animal ani=new Elephant();
		ani.disp();
		
		ani=new Tuna();
		ani.disp();
		
	
		
	}//main() end
}//class end
