package oop0521;

public class Test07_overload {

	public static void hap(int a, int b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(double a, double b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(String a, String b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(int a) {
		System.out.println(a);
	}//hap() end
	
/*	����. �Լ��� �������� �޼ҵ� �����ε��� ���������� �ƴϴ�
	public static int hap(int a) {}
*/	
	
	public static void main(String[] args) {
		//Method Overloading �Լ��� �ߺ� ����
		//->�Լ����� �ߺ��ؼ� �����Ҽ��ִ�
		
		//�޼ҵ� �����ε��� ��������
		//->�Ű������� �ڷ����� �޶�� �Ѵ�
		//->�Ű������� ������ �޶�� �Ѵ�
		
		hap(3, 5);
		hap(2.4, 5.6);
		hap("JAVA", "Python");
		hap(7);
		
		

	}//main() end
}//class end
