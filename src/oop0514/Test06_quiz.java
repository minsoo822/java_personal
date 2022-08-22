package oop0514;

public class Test06_quiz {

	public static void main(String[] args) {
		//if, switch~case 관련 연습문제
		
		//문1)평균점수에 따라서 A, B, C, D, F학점을 출력하시요
		int kor=90, eng=80, mat=95;		
		int aver=(kor+eng+mat)/3;
		System.out.println(aver);
		
		switch(aver/10) {
		case 10 : 
		case  9 : System.out.println("A"); break;
		case  8 : System.out.println("B"); break;
		case  7 : System.out.println("C"); break;
		case  6 : System.out.println("D"); break;
		default : System.out.println("F"); break;
		}//switch end
		
		
		//문2)주민번호를 이용해서 나이와 성별을 구하시오
		int myYear=19; 	 //태어난 년도
		int myCode=4;  	 //성별코드
		
		//1)나이 : 올해년도-태어난 년도
		//태어난 년도
		switch(myCode) {
		case 1: 
		case 2: myYear=myYear+1900; break;
		case 3: 
		case 4: myYear=myYear+2000; break;
		}//switch end
		
		int myAge=2022-myYear;
		System.out.println("나이 : "+ myAge);
		
		
		
		//2)성별 : 남자(1 또는 3), 여자(2 또는 4)
		if(myCode==1 || myCode==3) {
			System.out.println("성별:남자");
		}else if(myCode==2 || myCode==4) {
			System.out.println("성별:여자");
		}
		
		switch(myCode%2) {
		case 0: System.out.println("성별:여자");
		case 1: System.out.println("성별:남자");
		}
		
		
		
		
		
		switch(myCode) {
		case  1 : System.out.println("남자"); break;
		case  2 : System.out.println("여자"); break;
		case  3 : System.out.println("남자"); break;
		case  4 : System.out.println("여자"); break;
	
		}//switch end
		
		
		
		
		
		
	}//main() end
}//class end
