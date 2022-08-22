package oop0528;


class School { //packge생략되어 있음
			   //oop0528팩키지내에서만 접근해서 사용할 수 있다
	
	//멤버변수 field
	//private속성을 활용하여 특정멤버를 은폐할 수 있다
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자 함수 constructor
	//->클래스명과 동일한 함수
	//->함수에 리턴형이 존재하지 않는다
	//->public void School(){} 주의!!
	public School() { //기본자 생성자 함수 default constructor
					  //자동 생성된다
		System.out.println("School()...");		
	}//end
	
	//생성자 함수도 오버로딩(함수명 중복정의)이 가능하다
	public School(String n) { //메개변수 parmeter
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
	
	
	//멤버함수 method
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
		//생성자 함수 Constructor
		//->클래스명과 동일한 함수
		//->new 연산자와 함께 할당(객체생성)할때 사용한다
		//->오버로딩(Overloading)이 가능하다
		
		//소멸자 함수 Destructor
		//->자바에는 없음!!
		//->Garbage Collecting : JVM(자바가상머신)이 자동으로 메모리 회수를 함.
////////////////////////////////////////////////////////////////////////////////
		
		
		//메모리 할당할때 생성자 함수가 호출된다
		new School();
		
		School one=new School("무궁화");
		School two=new School(10, 20, 30);
		School three=new School("오필승", 40, 50, 60);
		
		one.calc();   one.disp();
		two.calc();   two.disp();
		three.calc(); three.disp();
		
		
		School four=null; //null 존재하지 않는 값
						  //"nill" 문자열상숙
		
		String nam="";   //글자갯수 : 0
		String str=null;	 //글자갯수 : 에러
		
		

	}//main() end
}//class end
