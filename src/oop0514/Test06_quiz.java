package oop0514;

public class Test06_quiz {

	public static void main(String[] args) {
		//if, switch~case ���� ��������
		
		//��1)��������� ���� A, B, C, D, F������ ����Ͻÿ�
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
		
		
		//��2)�ֹι�ȣ�� �̿��ؼ� ���̿� ������ ���Ͻÿ�
		int myYear=19; 	 //�¾ �⵵
		int myCode=4;  	 //�����ڵ�
		
		//1)���� : ���س⵵-�¾ �⵵
		//�¾ �⵵
		switch(myCode) {
		case 1: 
		case 2: myYear=myYear+1900; break;
		case 3: 
		case 4: myYear=myYear+2000; break;
		}//switch end
		
		int myAge=2022-myYear;
		System.out.println("���� : "+ myAge);
		
		
		
		//2)���� : ����(1 �Ǵ� 3), ����(2 �Ǵ� 4)
		if(myCode==1 || myCode==3) {
			System.out.println("����:����");
		}else if(myCode==2 || myCode==4) {
			System.out.println("����:����");
		}
		
		switch(myCode%2) {
		case 0: System.out.println("����:����");
		case 1: System.out.println("����:����");
		}
		
		
		
		
		
		switch(myCode) {
		case  1 : System.out.println("����"); break;
		case  2 : System.out.println("����"); break;
		case  3 : System.out.println("����"); break;
		case  4 : System.out.println("����"); break;
	
		}//switch end
		
		
		
		
		
		
	}//main() end
}//class end
