package oop0611;


interface Creature {
	//void disp() {} ����. �Ϲݸ޼ҵ�� ���Ұ�
	abstract void kind(); //�߻�޼ҵ常 �����ϴ�
	void breathe();		  //abstract ��������
}//interface end


//Ŭ���� ���忡�� �θ� Ŭ����    : extends Ȯ��
//Ŭ���� ���忡�� �θ� �������̽� : implements ����
class Tiger implements Creature { //�������̽� �θ� ��ӹ����� implements

	@Override
	public void kind() {
		System.out.println("������");
	}

	@Override
	public void breathe() {
		System.out.println("����");
	}
	
}//class end


class Salmon implements Creature {

	@Override
	public void kind() {
		System.out.println("���");
	}

	@Override
	public void breathe() {
		System.out.println("�ư���");
	}
	
}//class end



public class Test07_interface {

	public static void main(String[] args) {
		//�������̽� interface
		/*
		    - �߻�޼ҵ常 �����ϴ�
		    - �߻�Ŭ�������� �� �߻�ȭ �Ǿ� �ִ�
		    - implements ���� : Ŭ������ �������̽��� ��ӹ����� 		 
		 */
		
		
		//Creature creature=new Creature(); ����. �������̽��� ���� ��ü ���� �Ұ���
		
		
		//�������̽��� ������
		Creature creature=new Tiger();
		creature.kind();
		creature.breathe();
		
		creature=new Salmon();
		creature.kind();
		creature.breathe();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
