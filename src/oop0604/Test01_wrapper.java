package oop0604;

public class Test01_wrapper {

	public static void main(String[] args) {
		//Wrapper (����) Ŭ������
		//->�⺻�ڷ����� ������(Ŭ����)ȭ �� ���� Ŭ�������� ��Ī
		//->��κ� java.lang �⺻�б����� ����Ǿ� ����
		/*
		  	�⺻��        ������(Ŭ����)
		  	----------  ----------------
		 	boolean		Boolean
		 	byte		Byte
		 	short		Short
		 	int			Integer
		 	long		Long
		 	float		Float
		 	double		Double
		 	char		Character		 
		 */
		
		//Object Oriented Program ��ü ���� ���α׷�
		//�Լ����� Ư¡ : is�Լ�()    
		//			   get�Լ���() 
		//			   set�Լ���() 
		//			   to�Լ���()
				
		boolean boo1=true; 				 //�⺻��. boo1 ����variable
		Boolean boo2=new Boolean(false); //������. boo2 ��üobject
		Boolean boo3=true;
		System.out.println(boo1);
		System.out.println(boo2.toString());//"false"
		System.out.println(boo3.toString());//"true"
		
		
		
		byte by1=3;
		Byte by2=new Byte("5");
		Byte by3=7;
		System.out.println(by1);
		System.out.println(by2.doubleValue());//5.0
		System.out.println(by3.toString());	  //"7"
		
		
		int in1=2;
		Integer in2=new Integer(4); //old version
		Integer in3=6;				//new version
		System.out.println(in1);
		System.out.println(in2.doubleValue());
		System.out.println(in3.longValue());
		System.out.println(in3.toString());
		
		
		double dou1=2.3;
		Double dou2=4.5;
		System.out.println(dou1);
		System.out.println(dou2); //toString()�Լ��� ��������
		System.out.println(dou2.isNaN()); //Not a Number
		
		
		char ch1='R';
		Character ch2='n';
		System.out.println(ch1);
		System.out.println(ch2.toString());
		
		
		
		
		
		
		
		

	}//main() end
}//class end
