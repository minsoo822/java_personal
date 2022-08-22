package oop0430;

public class Test05_datatype {

	public static void main(String[] args) {
		//�ڷ��� Datatype
		//->�⺻�ڷ����� �����ڷ���(Ŭ����)
		
		//1. ������
		//byte < short < int < long
		//1����Ʈ  2�پ�Ʈ 3����Ʈ  4����Ʈ 
		
		byte b; //b��� ������ ����
		b=3;    //b������ 3�� ����(���Կ�����)
		System.out.println(b);
		
		short s=5; //�������� �� ������ ���ÿ�
		System.out.println(s);
		
		int i=7; //�⺻��
		System.out.println(i);
		
		long l=-9;
		System.out.println(l);
		
		//����. �ڷ����� �ѹ��� �����Ѵ�
		//int i=2;
		
		//������ �ڷ����� ������ , �� ���� ������ �����ϴ�
		int c=2, d=4;
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+d);
		
		//������ ���ο� ������ ���� �� �ִ�
		c=7;
		d=8;
		System.out.println(c+d);
/////////////////////////////////////////////////		
		
		//2. �Ǽ���
		//->�Ҽ����� �ִ� ��
		//float < double
		//4����Ʈ   8����Ʈ
		
		float f=1.2f;    //���̻� f�� �ٿ��� ��
		double dou=3.4d; //���̻� d�� ��������
		System.out.println(f);
		System.out.println(dou);
		
		//�ڹ��� �⺻ ������(int), �⺻ �Ǽ���(double)�̴�
		System.out.println(5);   //int��
		System.out.println(6.7); //double��
///////////////////////////////////////////////////
		
		//3. ������
		//-> ' �� ���Ѵ�
		//-> char 2����Ʈ �Ҵ�
		char ch='B';
		System.out.println(ch);
		
//		ch='��';
		System.out.println(ch);
		
		//ch='SKY'; ����
		//ch=''     ����. �������� ������� ����
/////////////////////////////////////////////////		
		
		//4. ���ڿ���
		//-> " ��ȣ�� ���Ѵ�
		String str="KOREA"; //������
		System.out.println(str);
		
		str="K";
		System.out.println(str);
		
		str=""; //���ڿ�. ���ڰ��� 0��
		System.out.println("#" + str + "#");
		
		str=" ";//���ڰ��� 1��
		System.out.println("#" + str + "#");
///////////////////////////////////////////////////////////		
		
		//5. ����
		//-> �� true, ���� false
		boolean flag=true;
		System.out.println(flag);
		
		flag=false;
		System.out.println(flag);
		
		System.out.println("false"); //���ڿ� ���
///////////////////////////////////////////////////////////	
		
		//����) ��ձ��ϱ�
		//�Է�
		String name="�����";
		int kor=85, eng=90, mat=100;
		
		//����
		double aver=(kor+eng+mat)/3;
		
		//���
		System.out.println("�̸�:" + name);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + mat);
		System.out.println("���:" + aver);
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
