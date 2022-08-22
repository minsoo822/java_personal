package oop0521;

public class Test02_array {

	public static void main(String[] args) {
		//�迭 Array
		/*
		   - ������ �ڷ����� ���� �Ѱ��� ������ 1�� �̻��� ������ �� �ִ�
		   - �迭�� �� ���(element)
		   - �迭�� ����(index)�� 0���� �����ؼ� 1�� �����Ѵ�
		   - new ������ : �޸� �Ҵ�(Ȯ��) ������
		   - 1���� �迭 : [��]	     ĭ, column
		   - 2���� �迭 : [��][��]	 ��, row
		   - 3���� �迭 : �ڹٿ��� ����	
		 */

		//1. 1���� �迭
		
		int[] kor=new int[3]; //4����Ʈ*3�� = 12����Ʈ �޸� �Ҵ�
		kor[0]=40;
		kor[1]=60;
		kor[2]=75;
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		System.out.println(kor.length);//3 kor �迭 ����� ����
		
		
		int[] eng= {90, 85, 30}; //�迭����� ���ÿ� �ʱⰪ ����		
		for(int i=0; i<eng.length; i=i+1) {
			System.out.println(eng[i]);
		}//for end
/////////////////////////////////////////////////////////////////////////////////////////
		
		String[] name= {"����ȭ", "���޷�", "������"};
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
		
		
		//2. 2���� �迭
		//	 [��][��]
		
		int[][] mat=new int[2][3]; //2��3�� . 4����Ʈ*6��=24����Ʈ �޸� �Ҵ�
		mat[0][0]=10;
		mat[0][1]=20;
		mat[0][2]=30;
		mat[1][0]=40;
		mat[1][1]=50;
		mat[1][2]=60;
		
		System.out.println(mat.length);    //2 2���� �迭�� ���� ����
		System.out.println(mat[0].length); //3 mat[0]���� ���� ����
		System.out.println(mat[1].length); //3 mat[1]���� ���� ����
		
		for(int a=0; a<=1; a=a+1) {
			for(int b=0; b<=2; b=b+1) {
				System.out.println(mat[a][b]);
			}//for end
		}//for end
		
///////////////////////////////////////////////////////////////////////////
		
		//2���� �迭���� �� ���� ���� ������ �޶� �����ϴ�
		int[][] aver= {
				          {10,20,30,40,50}
				         ,{60,70}
				         ,{80,90,100}
		              };
		System.out.println(aver.length); 	//3��
		System.out.println(aver[0].length); //5ĭ
		System.out.println(aver[1].length); //2ĭ
		System.out.println(aver[2].length); //3ĭ
		
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
