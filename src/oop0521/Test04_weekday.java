package oop0521;

public class Test04_weekday {

	public static void main(String[] args) {
		//���� ���ϴ� ���α׷�
		
		int cYear=2022, cMonth=5, cDate=21;
/*
    ����1��1��1�� ~ ���� 2022�� 5�� 21�� ������ �ѳ��� = ?
	�ѳ��� %7 -> 0�� 1�� 2ȭ 3�� 4�� 5�� 6�� 	 
		 
    1)�ܰ� : ���� 1�� ~ ���� 2021�� 
        ���� += 366
        ��� += 365   
        
    2)�ܰ� : 1�� ~ 4�� 
        1 3 5 7 8 10 12 : +=31
        3 6 9 11        : +=30
        2               : +=29 (����)
        2               : +=28 (���)
        
    3)�ܰ� : += 21    
*/
		
		int hap=0; //�ѳ���
		
		//1�ܰ�
		for(int y=1; y<cYear; y++) {
			if(y%4==0 && y%100!=0 || y%400==0) {//��������? 
				hap+=366;
			}else {
				hap+=365;
			}//if end
		}//for end
		
		System.out.println(hap);
		
		
		//2�ܰ�
		int[] mon= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(cYear%4==0 && cYear%100!=0 || cYear%400==0) {
			mon[2]=29;
		}//if end		
		
		for(int m=1; m<cMonth; m++) {
			hap+=mon[m];			
		}//for end
		
		
		//3)�ܰ�
		hap=hap+cDate;//hap+=cDate;
		
		System.out.println("�ѳ��� : "+ hap);
		
		//�������
		switch(hap%7) {
		case 0 : System.out.println("�Ͽ���"); break;
		case 1 : System.out.println("������"); break;
		case 2 : System.out.println("ȭ����"); break;
		case 3 : System.out.println("������"); break;
		case 4 : System.out.println("�����"); break;
		case 5 : System.out.println("�ݿ���"); break;
		case 6 : System.out.println("�����"); break;
		}//switch end
		
		
		
	}//main() end
}//class end
