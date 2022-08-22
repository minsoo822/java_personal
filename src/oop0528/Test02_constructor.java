package oop0528;


class School { //packge�����Ǿ� ����
			   //oop0528��Ű���������� �����ؼ� ����� �� �ִ�
	
	//������� field
	//private�Ӽ��� Ȱ���Ͽ� Ư������� ������ �� �ִ�
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//������ �Լ� constructor
	//->Ŭ������� ������ �Լ�
	//->�Լ��� �������� �������� �ʴ´�
	//->public void School(){} ����!!
	public School() { //�⺻�� ������ �Լ� default constructor
					  //�ڵ� �����ȴ�
		System.out.println("School()...");		
	}//end
	
	//������ �Լ��� �����ε�(�Լ��� �ߺ�����)�� �����ϴ�
	public School(String n) { //�ް����� parmeter
		name=n;
	}//end
	
	public School(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}//end
	
	public School(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//end
	
	
	//����Լ� method
	void calc() {
		aver= (kor+eng+mat)/3;
	}//clac() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	
	
}//clsaa end

/////////////////////////////////////////////////////////////////////
public class Test02_constructor {

	public static void main(String[] args) {
		//������ �Լ� Constructor
		//->Ŭ������� ������ �Լ�
		//->new �����ڿ� �Բ� �Ҵ�(��ü����)�Ҷ� ����Ѵ�
		//->�����ε�(Overloading)�� �����ϴ�
		
		//�Ҹ��� �Լ� Destructor
		//->�ڹٿ��� ����!!
		//->Garbage Collecting : JVM(�ڹٰ���ӽ�)�� �ڵ����� �޸� ȸ���� ��.
////////////////////////////////////////////////////////////////////////////////
		
		
		//�޸� �Ҵ��Ҷ� ������ �Լ��� ȣ��ȴ�
		new School();
		
		School one=new School("����ȭ");
		School two=new School(10, 20, 30);
		School three=new School("���ʽ�", 40, 50, 60);
		
		one.calc();   one.disp();
		two.calc();   two.disp();
		three.calc(); three.disp();
		
		
		School four=null; //null �������� �ʴ� ��
						  //"nill" ���ڿ����
		
		String nam="";   //���ڰ��� : 0
		String str=null;	 //���ڰ��� : ����
		
		

	}//main() end
}//class end
