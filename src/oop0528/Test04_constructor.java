package oop0528;


class Jumsu {
	
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//기본생성자 함수 자동코딩 추가
	//메뉴 Source
    //-> Generate Constructors From Superclass...
	public Jumsu() {}

	//매개변수가 있는 생성자 함수 자동 코딩 추가
	//메뉴 Source
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
		//생성자 함수 자동 코딩 추가

	}//main() end
}//class end
