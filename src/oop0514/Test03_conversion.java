package oop0514;

public class Test03_conversion {

	public static void main(String[] args) {
		//�ڷ�����ȯ Datatype Conversion
		
		//����)���������� ����ϸ� ���������θ� ��ȯ�ȴ�.
		System.out.println(3/5);	 //0
		System.out.println(3.0/5.0); //0.6
		System.out.println(3/5.0);	 //0.6
		System.out.println(3.0/5);	 //0.6
		System.out.println(3/5.); 	 //0.6
		
		
		//1. ������ ��ȯ(cast������)
		//->�ʿ��� ������ �Ͻ������� ��ȯ
		//->(�ڷ���)��
		System.out.println((int)1.3);
		System.out.println((int)2.4+(int)3.7);//2+3
		System.out.println((int)(2.4+3.7));   //(int)(6.1)
		
		System.out.println((double)5);
////////////////////////////////////////////////////////////////
		
		
		//int a=3.0; ����. �Ǽ����� ���������� �븳�Ҽ� ����
		
		//2. �ڵ��� ��ȯ
		//������ : byte < short < int < long
		//�Ǽ��� : float < double
		byte b=2;
		int i=b;  //b������ �ڵ��� int��ȭ �ȴ�.
		long l=i; //i������ �ڵ����� long��ȭ �ȴ�.
		//b=l; ����
		
		float f=3.4f;
		double d=f;
/////////////////////////////////////////////////////////////
		
		
		//int�� char���� ����ȯ
		System.out.println(65);
		System.out.println((char)65); //A
		
		System.out.println('a');
		System.out.println((int)'a'); //97
		
		//ASCII�ڵ尪�� �����ϹǷ�, int���� char���� ��������ȯ�� �����ϴ�
		System.out.println('A'<'a'); //true
		System.out.println((char)('A'+1));//B
		
		
		
		
		
		
		

	}//main() end

}//class end
