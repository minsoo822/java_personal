package oop0514;

public class Test07_for {

	public static void main(String[] args) {
		//�ݺ���
		//for, wile, do~wile
		//break	    : �ݺ����� ��������
		//continue	: �ݺ����� ��� ����
		//���� LOOP	: ���� ���� �ݺ�
		/*
		  	-for�� ����
		  	 for(���۰�; ���ᰪ; ����) {�ݺ��ϰ��� �ϴ� ��ɾ��}  			 
		 */
		
		
		//1. ������ ���� �ݺ�
		for(int a=1; a<=3; a=a+1) {
			
			System.out.println("JAVA");
		
		}//for end
		/*
			a=1  1<=3 JAVA  a=1+1
				 2<=3 JAVA  a=2+1
				 3<=3 JAVA  a=3+1
				 4<=3 
		 */
		
		
		//2. ���ҿ� ���� �ݺ�
		for(int b=3; b>=1; b=b-1) {
			System.out.println("Python" + b);
			
		}//for end
		/*
			b=3 3>=1 Python3 b=3-1
				2>=1 Python2 b=2-1
				1>=1 Python1 b=1-1
				0>=1
		
		*/
		
		
		
		//3.��ȿ����(SCOPE)
		//->Ư�� ������ ��ü�� ������ �� �ִ� ����
		for(int c=1; c<=5; c+=1) {
			System.out.println("KOREA");
		}//for end
		
		//for�� �ȿ� ����� c������ for�� �ȿ����� ��ȿ�ϴ�.
		//System.out.println(c); ����
		
	
		int d=0; //������ ����� ������������ �� �Ʒ������� ��� �����ϴ�
		for(d=1; d<=5; d++) {
			System.out.println("SEOUL");
		}//for end
		
		System.out.println(d);//6
		
		
		/* ����
		b=3 3>=1 Python3 b=3-1
			2>=1 Python2 b=2-1
			1>=1 Python1 b=1-1
			0>=1
	
	*/
		
		
		
	}//main() end
}//class end
