package oop0611;


interface IMessage{
	public void msPrint();
}//interface end


public class Test09_anonymous {

	public static void main(String[] args) {
		//�͸� ���� Ŭ���� Anonymous inner class
		//->�̸��� ���� Ŭ���� ���µ�
		//->�ʿ��� ���� �Ͻ������� ���
		
		
		//����
		//IMessage msg=new IMessage();
		
		
		//�߻�޼ҵ带 �������ϸ� �Ͻ������� ��ü ���� �� �� �ִ�
		IMessage msg=new IMessage() {
			@Override
			public void msPrint() {
				System.out.println("IMessage.msgPrint()");
			}
		};
		
		msg.msPrint();
		

	}//main() end
}//class end
