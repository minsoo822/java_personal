package oop0618;

public class Test01_format {

	public static void main(String[] args) {
		//��¼���
		/*
		   ������    %d
		   �Ǽ���    %f
		   ������    %c
		   ���ڿ���   %s
		   �ٹٲ�		\n
		*/
		
		//����) System.out.printf("��¼���", ��);
		
		System.out.printf("%d %d %d\n", 10, 20, 30);
		System.out.printf("����:#%d#\n",123);
		System.out.printf("����:#%5d#\n",123);
		System.out.printf("����:#%-5d#\n",123);
		
///////////////////////////////////////////////////////////		
		
		System.out.printf("%f %f\n", 1.2, 3.4);
		System.out.printf("Ű:%f\n", 165.7);
		System.out.printf("Ű:#%9.2f#\n", 165.7);
		System.out.printf("Ű:#%-9.2f#\n",165.7);
		System.out.printf("Ű:#%.2f#\n",  165.7);
		
//////////////////////////////////////////////////////////		
		
		System.out.printf("%c\n",'A');
		System.out.printf("#%-5c#\n",'B');

		System.out.printf("%s\n","APPLE");
		System.out.printf("#%-5s#\n","HI");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
