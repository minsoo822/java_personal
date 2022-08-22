package oop0604;


class Sawon{ //�������� package�����Ǿ� ����
	//������� field
	String sabun; //�����ȣ
	String name;  //�̸�
	int pay;	  //�޿�
	
	//�������Լ� constructor
	public Sawon() {} //�⺻�������Լ� default constructor
	public Sawon(String sabun, String name, int pay) {
		this.sabun=sabun; //this.�������=��������
		this.name=name;
		this.pay=pay;
	} //�Լ� �ߺ� ����(overloadin)
	
	//����Լ� method
	
	//static ����
	static String COMPANY="(��)����IT��ī����";
	static double TAX=0.03;
	static int SUDANG=10;
	//static �Լ�
	static void line() {
		System.out.println("-----------------------------");
	}//line() end
	
}//class end



//////////////////////////////////////////////////////
public class Test03_static {

	public static void main(String[] args) {
		//static������ ����
		
		//1)staticƯ¡�� �ݿ����� ���� ���(����õ)
		Sawon one=new Sawon("1001", "����ȭ", 100);
		//����=�޿�*0.03
		int myTax=(int)(one.pay*one.TAX);
		//�����޾�=(�޿�=����)-����
		int total=(one.pay+one.SUDANG)-myTax;
		
		//����ϱ�
		System.out.println("ȸ��� : " + one.COMPANY);
		System.out.println("��� : " + one.sabun);
		System.out.println("�̸� : " + one.name);
		System.out.println("�޿� : " + one.pay);
		System.out.println("���� : " + one.SUDANG);
		System.out.println("���� : " + myTax);
		System.out.println("�����޾� : " + total);
		one.line();
		
//////////////////////////////////////////////////////////////////////////		
	
		//2)staticƯ¡�� �ݿ��� ���(��õ)
		//->Ŭ������.����, Ŭ������.�Լ�() �����Ѵ�
		Sawon two=new Sawon("1003", "���ʽ�", 200);
		myTax=(int)(two.pay*Sawon.TAX);
		total=(two.pay+Sawon.SUDANG)-myTax;
		
		//����ϱ�
		System.out.println("ȸ��� : " + Sawon.COMPANY);
		System.out.println("��� : " + two.sabun);
		System.out.println("�̸� : " + two.name);
		System.out.println("�޿� : " + two.pay);
		System.out.println("���� : " + Sawon.SUDANG);
		System.out.println("���� : " + myTax);
		System.out.println("�����޾� : " + total);
		Sawon.line();
		
/////////////////////////////////////////////////////////////////////
		
		//3)static������ ����
		//->������ 1��, �Ҹ굵 1��
		//->static������ ������ ��� �̾�����(continue)
		
		Sawon son =new Sawon("3001", "�����", 300);
		Sawon park=new Sawon("4001", "������", 400);
		
		son.SUDANG=son.SUDANG+1;           //10+1
		System.out.println(son.SUDANG);
		
		park.SUDANG=park.SUDANG+1;		   //11+1
		System.out.println(park.SUDANG);
		
		Sawon.SUDANG=Sawon.SUDANG+1; 	   //12+1
		System.out.println(Sawon.SUDANG);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
