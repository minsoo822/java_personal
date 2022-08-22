package oop0514;

public class Test05_switch {

	public static void main(String[] args) {
		//switch~case문
		//->경우수의 목록중에서 제시하는 값과 일치하는 경우 수행
		//->실수값은 사용 불가
		//break : switch~case문을 빠져나옴
		
		//case목록값은 순차적이지 않아도 된다
		/*
		switch(10) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("BUSAN"); break;
		case 30 : System.out.println("JEJU"); break;
		}//switch end
		*/		
		
		
		//break가 없는경우
		/*
		switch(20) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("BUSAN"); break;
		case 30 : System.out.println("JEJU"); break;
		}//switch end
		*/
		
		
		//default : 찾고자하는 값이 목록 중에서 없는 경우 무조건 수행
		switch(40) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("BUSAN"); 
		case 30 : System.out.println("JEJU"); break;
		default : System.out.println("기타");
		}//switch end
		
				
	}//main() end

}//class end
