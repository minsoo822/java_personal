package oop0514;

public class Test04_if {

	public static void main(String[] args) {
		//제어문
		//->프로그램의 흐름을 제어
		//->조건문 : if, switch~case
		//->반복문 : for, while, do~wile
		//->break문
		//->continue문
		
/*
	if(조건) {조건이 true일때만 수행}
	
	if(조건) {조건이 true일때만 수행}
	else {조건이 false일때만 수행}

	if(조건1) {조건1이 true일때만 수행}
	else if(조건2) {조건2이 true일때만 수행}
	else if(조건3) {조건3이 true일때만 수행}
	else  {위의 조건들이 false일때 무조건 수행}
*/
///////////////////////////////////////////////////////		
		
		//성적 프로그램
		String name="무궁화";
		int kor=100, eng=100, mat=35; //mat=35 -> aver=78.33
		
		//평균 구하기
		double aver=(kor+eng+mat)/3.0;
		
		//출력하기
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("평균 : " + aver);
		
		
		//문1)평균이 95점 이상이면 장학생
		if(aver>=95) { //if(78.33>=95)
			System.out.println("장학생");
		}//if end
		
		
		//문2)국어점수가 70점 이상이면 합격, 아니면 불합격
		if(kor>=70) {
			System.out.println("국어:합격");
		}else {
			System.out.println("국어:불합격");
		}//if end
		
			
		//문3)수학점수가 90이상이 A학점
		//            80점이상 B학점
		//			  70점이상 C학점
		//			  60점이상 D학점
		//			  나머지 F학점

		if(mat>=90) {                      //if(75>=90)
			System.out.println("수학:A학점");
		}else if(mat>=80) {		           //else if(75>=80)
			System.out.println("수학:B학점");
		}else if(mat>=70) {			       //else if(75>=70) {수학:C학점}
			System.out.println("수학:C학점");
		}else if(mat>=60) {
			System.out.println("수학:D학점");
		}else {
			System.out.println("수학:F학점");
		}//if end
		
		
		//문4)과락
		//->평균이 70점이상이면 합격(단, 국영수중에서 한과목이라도 40점미만이면 재시험)
		//->평균이 70점미만이면 불합격
		
		//1)OR조건
		if(aver>=70) {
			
			if(kor<40 || eng<40 || mat<40) {//if(100<40 || 100<40 || 35<40)
											//if(false  || false  || true)
											//if(true)
				System.out.println("결과:재시험");
			}else {
				System.out.println("결과:합격");
			}//if end
		
		}else {
			System.out.println("결과:불합격");
		}//if end
		
		
		//2)AND조건
		if(aver>=70) {
			
			if(kor>=40 && eng>=40 && mat>=40) {
				System.out.println("결과:합격");
			}else {
				System.out.println("결과:불합격");
			}//if end
		
		}else {
			System.out.println("결과:불합격");
		}//if end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end

}//class end
