package oop0604;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test09_Calendar {

	public static void main(String[] args) {
		//Calendar Ŭ����
		//��¥ ���� Ŭ���� (����Ͻú���)
		/*
		 	class Calendar{}
		 	class GregorianCalendar extends Calendar{} 	     //���� ��¥ ��������
		 */
		
		GregorianCalendar now=new GregorianCalendar();
		
		System.out.println(now.get(1));     				 //2022
		System.out.println(now.get(Calendar.YEAR)); 		 //2022
		System.out.println(now.get(Calendar.MONTH));		 //5
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE)); 		 //4
		
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK));   //���� (1�� 2�� ... 7��)
		System.out.println(now.get(Calendar.HOUR_OF_DAY));   //24�ð� ����
		
		
		
		//�ش糯¥�� 1�� ���ϱ�
		now.add(Calendar.DATE, 1);
		System.out.println(now.get(Calendar.DATE));
		
		//�ش糯¥�� 10�� ����
		now.add(Calendar.DATE, -10);
		System.out.println(now.get(Calendar.DATE));
		
		//�ش糯¥�� 5�� ���ϱ�
		now.add(Calendar.MONTH, 5);
		System.out.println(now.get(Calendar.MONTH));
				
		//�ش糯¥�� 3�� ����
		now.add(Calendar.YEAR, -3);
		System.out.println(now.get(Calendar.YEAR));
		
		
		//now���� ���ο� ��¥ �籸���ϱ�
		//2002�� 12��31��
		now.set(Calendar.YEAR, 2022);
		now.set(Calendar.MONTH, Calendar.DECEMBER);
		now.set(Calendar.DATE, 31);
		
		

	}//main() end
}//class end
