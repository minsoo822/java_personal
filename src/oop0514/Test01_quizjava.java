package oop0514;

public class Test01_quizjava {

	public static void main(String[] args) {
		//Object Oriented Program ��ü�������α׷�
		
		//����) ������ ������ ���Ͻÿ�
		int money=53460;
		/*
		    ��°��
		    ���� 5 ��
		    õ�� 3 ��
		    ��� 4 ��
		    �ʿ� 6 ��
		 */
		
		//������������
		System.out.println(money/10000); //��5
		System.out.println(money%10000); //������ 3460
		
		int m=money/10000;
		System.out.println("���� : " + m + "��");
		
		money=money%10000; //3460
		int c=money/1000; //3
		System.out.println("õ�� : " + c + "��");
		
		money=money%1000; //460
		int b=money/100; //4
		System.out.println("��� : " + b + "��");
		
		money=money%100; //60
		int s=money/10; //6
		System.out.println("�ʿ� : " + s + "��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
