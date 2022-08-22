package oop0521;

public class Test02_array {

	public static void main(String[] args) {
		//배열 Array
		/*
		   - 동일한 자료형의 값을 한개의 변수에 1개 이상을 저장할 수 있다
		   - 배열의 각 요소(element)
		   - 배열의 순서(index)눈 0부터 시작해서 1씩 증가한다
		   - new 연산자 : 메모리 할당(확보) 연산자
		   - 1차원 배열 : [열]	     칸, column
		   - 2차원 배열 : [행][열]	 줄, row
		   - 3차원 배열 : 자바에는 없음	
		 */

		//1. 1차원 배열
		
		int[] kor=new int[3]; //4바이트*3개 = 12바이트 메모리 할당
		kor[0]=40;
		kor[1]=60;
		kor[2]=75;
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		System.out.println(kor.length);//3 kor 배열 요소의 갯수
		
		
		int[] eng= {90, 85, 30}; //배열선언과 동시에 초기값 저장		
		for(int i=0; i<eng.length; i=i+1) {
			System.out.println(eng[i]);
		}//for end
/////////////////////////////////////////////////////////////////////////////////////////
		
		String[] name= {"무궁화", "진달래", "개나리"};
		for(int i=0; i<name.length; i=i+1) {
			System.out.println(name[i]);
		}//for end
		
///////////////////////////////////////////////////////////////////////////////////////
		
		double[] height= {165.2, 180.6, 175.9};
		for(int i=0; i<height.length; i=i+1) {
			System.out.println(height[i]);
		}//for end
		
////////////////////////////////////////////////////////////////////////////////////////////
		
		char[] ch= {'S', 'K', 'Y'};
		for(int i=0; i<ch.length; i=i+1) {
			System.out.println(ch[i]);
		}//for end
///////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		//2. 2차원 배열
		//	 [행][열]
		
		int[][] mat=new int[2][3]; //2행3열 . 4바이트*6개=24바이트 메모리 할당
		mat[0][0]=10;
		mat[0][1]=20;
		mat[0][2]=30;
		mat[1][0]=40;
		mat[1][1]=50;
		mat[1][2]=60;
		
		System.out.println(mat.length);    //2 2차원 배열이 행의 갯수
		System.out.println(mat[0].length); //3 mat[0]행의 열의 갯수
		System.out.println(mat[1].length); //3 mat[1]행의 열의 갯수
		
		for(int a=0; a<=1; a=a+1) {
			for(int b=0; b<=2; b=b+1) {
				System.out.println(mat[a][b]);
			}//for end
		}//for end
		
///////////////////////////////////////////////////////////////////////////
		
		//2차원 배열에서 각 행의 열의 갯수가 달라도 가능하다
		int[][] aver= {
				          {10,20,30,40,50}
				         ,{60,70}
				         ,{80,90,100}
		              };
		System.out.println(aver.length); 	//3행
		System.out.println(aver[0].length); //5칸
		System.out.println(aver[1].length); //2칸
		System.out.println(aver[2].length); //3칸
		
		int row=aver.length;
		for(int r=0; r<row; r=r+1) {
			int col=aver[r].length;
			for(int c=0; c<col; c=c+1) {
				System.out.print(aver[r][c]+" ");
			}//for end
			System.out.println();
		}//for end
		/*
		    r=0  0<3
		              col=aver[0].length  ->5
		              c=0  0<5  aver[0][0]
		              	   1<5  aver[0][1]
		              	   2<5  aver[0][2]
		              	   3<5  aver[0][3]
		              	   4<5  aver[0][4]
		         1<3
		              col=aver[1].length  ->2
		              c=0  0<2  aver[1][0]
		                        aver[1][1]
		
		 */
	
		
		
		
	}//main() end
}//class end
