package oop0528;


class Score {
	//멤버변수 field
	private String name="코로나";
	private int kor, eng, mat;
	private int aver;
	
	//생성자함수 constructor
	
	//생성자 함수가 오버로딩이 되면 기본생성자함수는 자동으로 생성되지 않는다	
	public Score() {} //기본 생성자 함수는 강제적으로 추가할 것을 강추!!
	
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
	
	
	//멤버함수 method
	public void disp() {
		String name="손흥민"; //지역변수 local variable
		System.out.println(name); //손흥민. 지역변수의 우선순위가 가장 높다
		
		//멤버변수를 가리킬때 this
		System.out.println(this.name);//코로나
	}//end
	
}//clsaa end

////////////////////////////////////////////////////////////////
public class Test03_this {

	public static void main(String[] args) {
		//this
		//->클래스 자신을 가리키는 대명사
		//->멤버변수(field)와 일반변수(매개변수, 지역변수등)와 구분하기 위해
		//->this.멤버변수

		//기본생성자함수가 자동 생성이 되지 않은 경우
		//new Score("코리아");
		//new Score();
		
		Score score=new Score();
		score.disp();
		
		
		
		
	}//main() end
}//class end
