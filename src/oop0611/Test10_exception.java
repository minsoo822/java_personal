package oop0611;

public class Test10_exception {

	public static void main(String[] args) {
		//예외처리 Exception
		//-> 클래스를 실행할 때 발생하는 에러
		//-> try~catch문
		//-> finally문
		
		
		//1. 예외처리를 하지 않은 경우
		//-> 프로그램이 전상적으로 종료되지 않음
		/*
		System.out.println(1);
		System.out.println(3/0); //ArithmeticException 발생
		System.out.println(5);
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//2. 예외처리를 한 경우
		//-> 에러의 원인을 보고 해결하는 것이 중요!!
		/*
		try {
			//Exception이 예상되는 코드
			System.out.println(1);
			System.out.println(3/0);
			System.out.println(5);
		} catch(ArithmeticException e) {
			//Exception이 발생이 되면 처리하는 코드 작성
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//3.
		/*
		 try {
			System.out.println(1);
			int[] num=new int[3];
			num[5]=7;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//4.
		/*
		try {
			System.out.println(1);
			int a=Integer.parseInt("KOREA");
			System.out.println(3);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////
		
		//5.
		/*
		try {
			System.out.println(1);
			Integer inte=null;
			int a=3/inte;
		}catch (NullPointerException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
///////////////////////////////////////////////////////////////////		
		
		//6. 다중 catch문
		/*
		try {
			System.out.println(1);
			System.out.println(3/0);
			int a=Integer.parseInt("KOREA");
			Integer inte=null;
			int b=5/inte;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (NullPointerException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
//////////////////////////////////////////////////////////////////////////		
		
		//7.
		//Exception 클래스 : 모든 예외처리의 조상클래스
		/*
		try {
			System.out.println(1);
			System.out.println(3/0);
			int a=Integer.parseInt("KOREA");
			Integer inte=null;
			int b=5/inte;
		}catch (Exception e) { //다형성
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
///////////////////////////////////////////////////////////////////////////
		
		//8. finally문
		//->예외가 반생이 되도 실행
		//->예외가 발생되지 않아도 실행
		try {
			System.out.println("OPEN");
			System.out.println(1/0);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(e);	
		}finally {
			System.out.println("CLOSE");
		}//end
		
		System.out.println("END");
		
		
	

	}//main() end
}//class end
