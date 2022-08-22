package oop0604;

public class Jumsu {
	//멤버변수 field
	private int no;					 //번호
	private String name;			 //이름
	private char[] ox=new char[5];	 //OX표시
	private int[] answer=new int[5]; //답안제출
	
	public int score;				 //점수
	public int rank;				 //등수
	
	//생성자 함수 constructor
	public Jumsu() {}
	public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
		this.no=no;
		this.name=name;
		this.answer[0]=a0;
		this.answer[1]=a1;
		this.answer[2]=a2;
		this.answer[3]=a3;
		this.answer[4]=a4;
		this.score=0;
		this.rank=1;
	}//end
	
		
	//멤버함수 method
	public void compute() {
		//제출한 답안(answer)과 정답을 비교해서
		//OX를 표시하고(ox), 맞은 갯수에 따라 점수 구하기(score)
		
		int[] dap= {3, 3, 3, 3, 3}; //정답
		
		for(int i=0; i<=4; i++) {
			if(answer[i]==dap[i]) {
				//맞았을때
				ox[i]='o';
				score=score+20;
			}else {
				//틀렸을때
				ox[i]='x';
			}//if end
		}//for end
	}//cpmpute() end
	
	public void disp() {
		System.out.print(no + " ");
		System.out.print(name + " ");
		System.out.print(ox[0] + " ");
		System.out.print(ox[1] + " ");
		System.out.print(ox[2] + " ");
		System.out.print(ox[3] + " ");
		System.out.print(ox[4] + " ");
		System.out.print(score + " ");
		System.out.print(rank);
		System.out.println();//줄바꿈
	}//disp() end
	
	
}//class end





















