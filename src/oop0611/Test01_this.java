package oop0611;


class Sungjuk { //�������� package �����Ǿ� ����
	            //Sungjuk Ŭ������ oop0611��Ű���������� ���ٰ����ϴ�
	//������� field
	String nama;
	int kor, eng, mat;
	int aver;
	
	//������ �Լ� constructor
	//->Ŭ������� ������ �Լ�
	//->new�����ڷ� ��ü������ �ʿ��Ѵ�
	public Sungjuk() { //�⺻�������Լ� default constructor
		//Sungjuk("�����");����
		this("�����");//�ڽ��� �������Լ��� ȣ���ҋ�
	}//end
	
	//������ �Լ��� �����ε��� �����ϴ�
	public Sungjuk(String name) {
		
	}//end
	
	public Sungjuk(int k, int e, int m){
		this("���ʽ�");
		this.aver=(k+e+m)/3;
		//this
	}//end
	
	public Sungjuk(String n, int k, int e, int m) {
		calc();//������ �Լ��� �Ϲ� �޼ҵ�
	}//end
	
	
	
	//����Լ� method
	public void calc( ) {
		//this("�ڸ���", 10, 20, 30); ����. �Ϲ� �޼ҵ忡�� ������ �Լ��� ȣ���� �� ����
	}//calc() ens
	
	
	
	
	
}//class end




public class Test01_this {

	public static void main(String[] args) {
		//this() : �������Լ��� �ڽ��� ������ �Լ��� ȣ���� ��
		//this   : ��������� �Ϲݺ����� �����ϱ� ����. this.�������
		
		

		

	}//main end
}//class end
