package oop0430;

public class Test07_quiz {

	public static void main(String[] args) {
		//��������
		
		//��1)������ ������ ¦��(2�ǹ��)���� Ȯ���Ͻÿ�
		int a=4;
		System.out.println(a%2==0);
		               //  4%2
		               //  0  ==0
		
		System.out.println(a%2!=1);
		              //   4%2
		              //   0  !=1
		
		//��2)������ ������ 4�ǹ������ Ȯ���Ͻÿ�
		int b=7;
		System.out.println(b%4==0);
		               //  7%4
		               //  3  ==0
		
		//��3)�ش�⵵ �������� Ȯ���Ͻÿ�
		int year=2022;
		System.out.println(year%4==0);
		
		
		//��4)������ �������� 2�� ����̸鼭 5�� ������� Ȯ���Ͻÿ�
		int c=6;
		System.out.println(c%2==0 && c%5==0);
		               //  6%2       6%5
		               //  0  ==0    1  ==0
		               //  true      false
		               //  false
		
		//��5)�����ڵ尡 1 �Ǵ� 3���� Ȯ���Ͻÿ�
		int code=1;
		System.out.println(code==1 || code==3);
		
		

	}//main() end
}//class end
