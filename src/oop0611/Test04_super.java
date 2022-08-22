package oop0611;


class School{
	public String name="�б�";
	public School() {
		System.out.println("School()...");
	}//end
}//class end


class MiddleSchool extends School {
	public String name="���б�";
	public MiddleSchool() {
		
		super(); //�θ������ �Լ��� ȣ���ϴ� ��ɾ� �����Ǿ� ����
		
		System.out.println("MiddleSchool()...");
	}//end
}//class ens


class HighSchool extends School {
	public String name="����б�";
	public HighSchool() {
		super();//��������
		System.out.println("HighSchool()...");
	}//end
	
	public void disp() {
		String name="���ʰ���б�";
		System.out.println(name);	    //���ʰ���б�. ��������
		System.out.println(this.name);  //����б�. this.������
		System.out.println(super.name); //�б�.	  super.�θ���
	}//disp() end
}//class end


public class Test04_super {

	public static void main(String[] args) {
		//super, �θ�, ����
		/*
		   super	: �ڽ�Ŭ�������� �θ�Ŭ���� ��������� ������ ��
		   super()	: �ڽ�Ŭ������ �������Լ��� �θ�Ŭ������ ������ �Լ��� ȣ���� ��
		   
		   this		: �������(field)�� ���������� �����ϱ� ���� 
		   this()	: �ڽ��� ������ �Լ��� ȣ���� ��
		 */
		
		
		//��Ӱ��迡���� �θ�������Լ��� ȣ���ϰ� �ڽ��� �������Լ��� ȣ��
		//School()->MiddleSchool
		MiddleSchool ms=new MiddleSchool();
		
		
		//School() -> HighSchool
		HighSchool hs=new HighSchool();
		hs.disp();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
