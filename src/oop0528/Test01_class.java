package oop0528;  //현재 클래스(Test01_class)의 저장위치
                  //package는 한번만 선언한다

//클래스를 사용하려면 저장위치를 선언해야 한다
//import는 여러번 선언 가능하다
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.awt.AWTEvent;

//식별자
//->프로젝트명 basicJava
//->팩키지명   oop0528
//->클래스명  Test01_class 클래스명의 첫글자는 주로 대문자로 한다
//->함수명, 변수명, 객체명

/*
	● Access Modifiers 접근수정, 접근제어
      -> private    : 비공개. 클래스 내부에서만 접근 가능
      -> package    : 현재 팩키지(oop0528)내에서만 접근 가능. 생략한 경우 기본값
      -> protected  : 상속관계에 있는 다른 package에 존재하는 경우에만 접근 가능
      -> public     : 공개. basicJava프로젝트내에서는 모두 접근 가능
*/
/////////////////////////////////////////////////////////////////////

//사용자 정의 클래스
class Sungjuk{ //package class Sungjuk
	           //->package는 생략해야 한다
	
	//클래스 내부에서는 접근제어와 상관없이 서로 접근 가능하다
	
	//멤버변수 field
	public String name;
	int kor, eng, mat;  //package 접근제어가 생략되어 있다
	private int aver;
	
	//멤버함수 method
	void calc() { //package접근 제어가 생략되어 있다
		aver=(kor+eng+mat)/3;
	}//calc() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	private void view() {}
	
}//class end

/////////////////////////////////////////////////////////////////////

public class Test01_class {

	public static void main(String[] args) {
		//Class 클래스
		//->참조 자료형(reference)
		//->구성멤버 : 멤버변수(field) + 멤버함수(method)
		//->클래스는 메모리(RAM)를 할당(new연산자)하고 사용한다 : 객체(Object)
		//->객체 선언 형식 : new 생성자함수()
//------------------------------------------------------------------
		
		int a=3; //a는 일반 지역변수
		new Sungjuk(); //객체 Object
		               //RAM의 heap공간에 메모리 확보(#100번지)
		
		//sj : 참조(reference)변수. 메모리에 할당된 곳의 주소값(#110)을 저장
		Sungjuk sj=new Sungjuk(); //#110번지
		//참조변수를 통해 객체의 멤버에 접근하는 연산자 : . 연산자
		sj.name="손흥민";
		sj.kor=100;
		sj.eng=95;
		sj.mat=80;
		//sj.aver 에러. private속성은 접근 불가능
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		sj.calc();
		sj.disp();
		//sj.view()에러. private속성은 접근 불가능		
		
///////////////////////////////////////////////////////////
		
		//Object Oriented Program 객체 지향 프로그램
		//클래스명 참조변수=new 클래스명()
	
		Sungjuk sungjuk=new Sungjuk();  //#120번지
		sungjuk.name="김연아";
		sungjuk.kor=70;
		sungjuk.eng=65;
		sungjuk.mat=50;
		sungjuk.calc();
		sungjuk.disp();
		
///////////////////////////////////////////////////////////		
		
		//참조변수가 가지고 있는 객체의 주소값
		System.out.println(sj.hashCode());
		System.out.println(sungjuk.hashCode());
		
		int i=3;
		int j=i;
		
		Sungjuk tmp=sungjuk;
		System.out.println(tmp.hashCode());
		

	}//main() end
}//class end
