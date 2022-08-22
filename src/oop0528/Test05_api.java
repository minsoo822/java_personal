package oop0528;

import java.util.GregorianCalendar;
import java.lang.*; //�ڹ��� �⺻ ��Ű��. ���������ϴ�


public class Test05_api {

	public static void main(String[] args) {
		//�⺻ API
		
		//1. �޷� ���� Ŭ����
		GregorianCalendar cal=new GregorianCalendar();
		System.out.println(cal.get(5));//���ó�¥ 28
		System.out.println(cal.get(2));//�� 		4
		System.out.println(cal.get(2)+1);
		System.out.println(cal.get(1));//�⵵  	2022
		
		//2022���� �������� Ȯ���Ͻÿ�
		if(cal.isLeapYear(2022)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}//if end
		
		
		//��)����1��~����2022����� ������ ������ ���Ͻÿ�
		int count=0;
		for(int y=1; y<=2022; y++) {
			if(cal.isLeapYear(y)) {
				count++;
			}//if end
		}//for end
		
		System.out.println(count);
		
//////////////////////////////////////////////////////////////////////////
		
		//2. Math ���� ���� Ŭ����
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));    //3	���밪
		System.out.println(Math.ceil(1.3));	 //2.0	�Ҽ��� �ø�
		System.out.println(Math.floor(2.7)); //2.0	�Ҽ��� ����
		System.out.println(Math.round(3.8)); //4	�ݿø�
		
		//���� random��
		//������ ���� 0.0<= r < 1.0
		//System.out.println(Math.random());
		//System.out.println((int)(Math.random()*2)); //0 1
		//System.out.println((int)(Math.random()*4)); //0 1 2 3
		//System.out.println((int)(Math.random()*6)); //0 1 2 3
		
		//��) �ֻ��� 1~6������ ���� ���Ͻÿ�
		System.out.println((int)(Math.random()*6)+1);
		
////////////////////////////////////////////////////////////////////////////////
		
		//3. Integer ������ ���� Ŭ����
		Integer intel1=new Integer(3);
		Integer intel2=new Integer("5");
		
		System.out.println(intel1.doubleValue()); //3.0
		System.out.println(intel2.byteValue());   //byte�� 5 ���� ��ȯ
		
		System.out.println(Integer.toBinaryString(5));//"101" 2������ȯ
		System.out.println(Integer.toOctalString(10));//"12"  8������ȯ
		System.out.println(Integer.toHexString(12));  //"c"   16������ȯ
		
		//�ڡڡ� "123" -> 123 ��ȯ �Լ�
		int num=Integer.parseInt("123"); //123
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
