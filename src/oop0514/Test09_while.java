package oop0514;

public class Test09_while {

	public static void main(String[] args) {
		//1. while �ݺ���
		//-> ����) while(����) {������ true�̸� ����}
		//-> while(true){} ����LOOP
		//-> for(;;){}     ����LOOP
		
		int a=1;
		while(a<=3) {
			System.out.println("JAVA");
			a=a+1;
		}//while end
		/*
		 	while(1<=3) {JAVA a=1+1}
		 	while(2<=3) {JAVA a=2+1}
		 	while(3<=3) {JAVA a=3+1}
		 	while(4<=3) 
		 */
		
		int b=1;
		while(true) {
			System.out.println("KOREA");
			b=b+1;
			if(b==5) {
				break; //�ݺ��� ��������
			}			
		}

//////////////////////////////////////////////////////////
		
		
		
		//2 do~wile �ݺ���
		/*
		   do{
		   		������ true�̸� ����
		   }while(����);
		   
		*/
		
		int c=1;
		do {
			System.out.println("Python");
			c=c+1;
		}while(c<=3);
		/*
		
		
		
		
		*/
		
		

		
	}//main() end
}//classend
