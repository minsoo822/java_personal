package oop0528;


class Jumsu {
	
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//�⺻������ �Լ� �ڵ��ڵ� �߰�
	//�޴� Source
    //-> Generate Constructors From Superclass...
	public Jumsu() {}

	//�Ű������� �ִ� ������ �Լ� �ڵ� �ڵ� �߰�
	//�޴� Source
	//-> Generate Constructor using Fields...
	public Jumsu(String name) {
		this.name = name;
	}//end

	public Jumsu(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}//end

	public Jumsu(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}//end
	
}//end

/////////////////////////////////////////////////////////////////////////////
public class Test04_constructor {

	public static void main(String[] args) {
		//������ �Լ� �ڵ� �ڵ� �߰�

	}//main() end
}//class end
