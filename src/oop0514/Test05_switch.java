package oop0514;

public class Test05_switch {

	public static void main(String[] args) {
		//switch~case��
		//->������ ����߿��� �����ϴ� ���� ��ġ�ϴ� ��� ����
		//->�Ǽ����� ��� �Ұ�
		//break : switch~case���� ��������
		
		//case��ϰ��� ���������� �ʾƵ� �ȴ�
		/*
		switch(10) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("BUSAN"); break;
		case 30 : System.out.println("JEJU"); break;
		}//switch end
		*/		
		
		
		//break�� ���°��
		/*
		switch(20) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("BUSAN"); break;
		case 30 : System.out.println("JEJU"); break;
		}//switch end
		*/
		
		
		//default : ã�����ϴ� ���� ��� �߿��� ���� ��� ������ ����
		switch(40) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("BUSAN"); 
		case 30 : System.out.println("JEJU"); break;
		default : System.out.println("��Ÿ");
		}//switch end
		
				
	}//main() end

}//class end
