package oop0521;											

public class Test06_method {

	//���ϰ��� �ڷ����� void�ڸ��� ����
	public static int test1(int a, int b) {
		int sum=a+b;
		return sum; //���ϰ��� 1�� ���� ���ϵȴ�       	*���ϰ��� 2���� �ϰ������ �迭
	}//test1() end
	
	public static String test2(int a) {
		if(a%2==0) {
			return "¦��";
		}else {
			return "Ȧ��";
		}//if end
	}//test2() end
	
	public static long fact(int a) {
		long gop=1;
		for(int f=a; f>=1; f--) {
			gop=gop*f;
		}//for end
		return gop;
	}//fact() end
	
	public static boolean leap(int y) {
		if(y%4==0 && y%100!=0 || y%400==0) {
			return true;
		}else {
			return false;
		}//if end
	}//leap() end
	
	public static void main(String[] args) {
		//3. ���ϰ��� �ִ� ���
		
		int result=test1(3, 5);
		System.out.println(result);
		System.out.println(test1(2,4));
		
		
		String str=test2(6);
		System.out.println(str);
		System.out.println(test2(7));
			

		
		//��1) 4���丮���� ���Ͻÿ� (4*3*2*1);
		long gop=fact(4);
		System.out.println(gop);
		
				
		
		//��2) ����, ����� ���Ͻÿ�
		if(leap(2002)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}//if end
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
