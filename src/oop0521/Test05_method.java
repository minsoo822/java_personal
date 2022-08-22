package oop0521;

public class Test05_method {
	
	//�޼ҵ�(�Լ�) �ۼ� ����
	//�Լ� ����(�ۼ�)
	
	public static void test1() { //void ���ϰ��� ����(��ġ��)
		System.out.println("JAVA");
	}//test1() end
	
	public static void test2() {
		System.out.println("Python");
	}//test2() end
	
	public static void test3() {
		System.out.println("HTML");
		return; //�Լ��� ȣ���� �������� �ǵ��� ����
		  		//������ return�� ���������ϴ�
	}//test3() end
	
	public static void test4(int a) { //a�� �Ű�����(parameter)
		System.out.println(a);
	}//test4() end
	
	public static void test5(int a, int b, int c) { //�Ű������� �ڷ����� ������ �� ����
		System.out.println(a+b+c);
	}//test5() end	
	
	public static void test6(double a, double b) {
		System.out.println(a+b);
	}//test6() end
	
	public static void test7(char ch, int a) {
		for(int n=1; n<=a; n++) {
			System.out.println(ch);
		}//for end
	}//test7() end
	
	public static void main(String[] args) {
		//Method �޼ҵ� �ڡڡڡڡ� 
		//�Լ�, funcion
		//->������ ����� ���� ����
		/*
		  �� �ĺ���
		  	- ������Ʈ�� basicJava
		  	- ��Ű����  oop0521
		  	- Ŭ������  Test05_method
		  	- ������, �Լ���
		 
		  �� Method �Լ�
		    - �Լ�  �ۼ��� ������� : �Ű�����(parameter), ���ϰ�
		    - �Լ��� �ۼ��ϰ�, �� �Լ��� ȣ�������ν� �����Ѵ�
		    - �Լ�����(����) ���� : ������ �Լ���(){}
		    - test() �Լ�, test ����				
		 */
		
		
		//1. ���ް�(argument value)�� ���� ���
		test1(); //�Լ�ȣ��
		test2();
		test1();
		test1();
		test3();
		
		
		
		//2. ���ް��� �ִ� ���
		test4(10);
		test4(30);
		test4(50);
		
		test5(2, 4, 6);
		test5(3, 5, 7);
		
		
		test6(1.2, 3.4);
		
		test7('#', 100);
		
		
	
	}//main() end (�����Լ�)
}//class end
