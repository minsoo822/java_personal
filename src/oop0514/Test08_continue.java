package oop0514;

public class Test08_continue {

	public static void main(String[] args) {
		//break�� continue
		
		//1.break��
		for(int a=1; a<10; a=a+1) {
			if(a==5) {
				break;//�ݺ����� ��������
			}//if end
			System.out.print(a);
		}//for end
		System.out.println();//�ٹٲ�
		
		
		
		
		//2.continue��
		for(int a=1; a<10; a=a+1) {			
			if(a==5) {
				continue;//�ݺ����� ��� ����(U��)
			}//if end
			System.out.print(a);
		}//for end
		
		
	}//main() end
}//class end
