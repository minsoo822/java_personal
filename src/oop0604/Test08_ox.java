package oop0604;

public class Test08_ox {

	public static void main(String[] args) {
		/*
		 	[예제] 성적프로그램 OX 표시하기
		 	
			          ** 시험결과 **
			====================================
			번호   이름   1  2  3  4  5  점수  등수     
			------------------------------------   
			1    홍길동  O  X  O  O  O   80   2   
			2    무궁화  O  O  O  O  O   100  1
			3    라일락  X  X  X  X  O   20   5
			4    진달래  X  O  X  O  O   60   3
			5    봉선화  O  O  X  X  X   40   4
			------------------------------------   
			
			- 맞은문제 O , 틀린문제 X표시
			- 점수: O당 20점씩
			- 등수: 점수를 기준으로 높은사람이 1등
		 */
		
		// Jumsu 클래스 생성한 후 작성
		
		
		//1) 1명만 출력하기
		//Jumsu student=new Jumsu(1, "홍길동", 3, 1, 3, 3, 3);
		//student.compute();
		//student.disp();
		
		
		
		//2) 5명 출력하기
		Jumsu[] student= {
							 new Jumsu(1, "홍길동", 3, 1, 3, 3, 3)
							,new Jumsu(2, "무궁화", 3, 3, 3, 3, 3)
							,new Jumsu(3, "라일락", 1, 2, 4, 4, 3)
							,new Jumsu(4, "진달래", 4, 3, 2, 3, 3)
							,new Jumsu(5, "봉선화", 3, 3, 1, 2, 2)
						 };
		
		//0번째 요소 성적 계산 및 출력
		//student[0].compute();
		//student[0].disp();
		
		//① 5명의 점수를 계산하기
		for(int i=0; i<=4; i++) {
			student[i].compute();
		}//for end
		
		
		//② 점수(score)를 기준으로 등수(rank)구하기

		for(int a=0; a<=4; a++) {
			for(int b=0; b<=4; b++) {
				if(student[a].score < student[b].score) {
					student[a].rank=student[a].rank+1;
				}//if end
			}//for end
		}//for end
		
		//③ 5명의 성적 출려하기
		for(int i=0; i<=4; i++) {
			student[i].disp();
		}//for end
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
