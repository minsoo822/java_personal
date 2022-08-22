package oop0611;

import java.util.Calendar;
import java.util.GregorianCalendar;



class Father extends Object { //extends Object �������� 
	public String name="�ƹ���";
	public String addr="�ּ�";
	
	public Father() {}
	public Father(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}//end
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}//disp() end
	
}//class end

class Son extends Father {
	
	public Son() {}
	public Son(String n, String a) {
		super(n, a);
	}//end
	
}//class end

class Daughter extends Father {
	
	String friend="��ģ";
	public Daughter() {}
	public Daughter(String n, String a) {
		super(n, a);
	}//end
	
}//class end




public class Test05_poly {

	public static void main(String[] args) {
		//��Ӱ��迡���� ������ Polylmorphism
		/*
		   - ��� : extends(Ȯ��), implements(����)
		   - �θ�������� ���°� ��������
		   - Ŭ�����鰣�� ����ȯ �۾��� ������		 
		 */
		
		
		GregorianCalendar now=new GregorianCalendar();
		if(now.isLeapYear(2022)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}//if end
		
		
		//�������� ����� ��ü ����  (�ڽ��� �θ����� ���� �ִ�)
		Calendar cal=new GregorianCalendar();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		Integer inte=new Integer(3);
		Object obj=new Integer(5);
///////////////////////////////////////////////////////////////////
		
		
		//1)�̹����� ����� ��ü ����
		//->new�����ڿ� ���� ������ �Լ��� �̿��� ��ü ����
		//->POJO (Plain Old Java Object) ���
		
		//Father fa=new Father();
		//Son son=new Son();
		//Daughter daugh=new Daughter();
		
/////////////////////////////////////////////////////////////////////
		
		//2)�������� �̿��� ��ü ����
		//->�ڽ�Ŭ������ �θ�Ŭ������ ���� �����ϴ�
		//Father fa=new Son();
		//Father fa=new Daughter();
		
		//�θ�Ŭ������ �ڽ��� ������� �ٲ��
		Father fa=new Son("�����", "����");
		fa.disp();
				
		fa=new Daughter("�迬��", "�ѱ�");
		fa.disp();
		
		System.out.println(fa.name);
		System.out.println(fa.addr);
		//System.out.println(fa.friend); ����
		//->�ڽ�Ŭ������ ���Ӱ� �߰��� ����� �������� ����� �ƴϴ�
		
////////////////////////////////////////////////////////////////////		
		
		//3)�θ�Ŭ������ �ڽ�Ŭ������ ������ �� �ִ�
		//  (��, �ڽ��� ������� ��ȯ �� �����ϴ�)
		Father father=new Father();
		Son son=new Son();
		
		father=son; //�ڽ��� �θ� ���� �����ϴ�
		
		son=(Son)father; //�θ� �ڽĿ� ���� ����������, ������ �սǰ� ���ܰ� �߻� �� ���� ����.
		
		

	}//main() end
}//class end
