package oop0528;


class Score {
	//������� field
	private String name="�ڷγ�";
	private int kor, eng, mat;
	private int aver;
	
	//�������Լ� constructor
	
	//������ �Լ��� �����ε��� �Ǹ� �⺻�������Լ��� �ڵ����� �������� �ʴ´�	
	public Score() {} //�⺻ ������ �Լ��� ���������� �߰��� ���� ����!!
	
	public Score(String n) {
		name=n;
	}//end
	
	public Score(int kor, int eng, int mat) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}//end
	
	public Score(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}//end	
	
	
	//����Լ� method
	public void disp() {
		String name="�����"; //�������� local variable
		System.out.println(name); //�����. ���������� �켱������ ���� ����
		
		//��������� ����ų�� this
		System.out.println(this.name);//�ڷγ�
	}//end
	
}//clsaa end

////////////////////////////////////////////////////////////////
public class Test03_this {

	public static void main(String[] args) {
		//this
		//->Ŭ���� �ڽ��� ����Ű�� ����
		//->�������(field)�� �Ϲݺ���(�Ű�����, ����������)�� �����ϱ� ����
		//->this.�������

		//�⺻�������Լ��� �ڵ� ������ ���� ���� ���
		//new Score("�ڸ���");
		//new Score();
		
		Score score=new Score();
		score.disp();
		
		
		
		
	}//main() end
}//class end
