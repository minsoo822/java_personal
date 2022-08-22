package oop0611;

public class Test10_exception {

	public static void main(String[] args) {
		//����ó�� Exception
		//-> Ŭ������ ������ �� �߻��ϴ� ����
		//-> try~catch��
		//-> finally��
		
		
		//1. ����ó���� ���� ���� ���
		//-> ���α׷��� ���������� ������� ����
		/*
		System.out.println(1);
		System.out.println(3/0); //ArithmeticException �߻�
		System.out.println(5);
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//2. ����ó���� �� ���
		//-> ������ ������ ���� �ذ��ϴ� ���� �߿�!!
		/*
		try {
			//Exception�� ����Ǵ� �ڵ�
			System.out.println(1);
			System.out.println(3/0);
			System.out.println(5);
		} catch(ArithmeticException e) {
			//Exception�� �߻��� �Ǹ� ó���ϴ� �ڵ� �ۼ�
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//3.
		/*
		 try {
			System.out.println(1);
			int[] num=new int[3];
			num[5]=7;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//4.
		/*
		try {
			System.out.println(1);
			int a=Integer.parseInt("KOREA");
			System.out.println(3);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//5.
		/*
		try {
			System.out.println(1);
			Integer inte=null;
			int a=3/inte;
		}catch (NullPointerException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
///////////////////////////////////////////////////////////////////		
		
		//6. ���� catch��
		/*
		try {
			System.out.println(1);
			System.out.println(3/0);
			int a=Integer.parseInt("KOREA");
			Integer inte=null;
			int b=5/inte;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (NullPointerException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////////////		
		
		//7.
		//Exception Ŭ���� : ��� ����ó���� ����Ŭ����
		/*
		try {
			System.out.println(1);
			System.out.println(3/0);
			int a=Integer.parseInt("KOREA");
			Integer inte=null;
			int b=5/inte;
		}catch (Exception e) { //������
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
///////////////////////////////////////////////////////////////////////////
		
		//8. finally��
		//->���ܰ� �ݻ��� �ǵ� ����
		//->���ܰ� �߻����� �ʾƵ� ����
		try {
			System.out.println("OPEN");
			System.out.println(1/0);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(e);	
		}finally {
			System.out.println("CLOSE");
		}//end
		
		System.out.println("END");
		
		
	

	}//main() end
}//class end
