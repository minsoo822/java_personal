package oop0604;

public class Test08_ox {

	public static void main(String[] args) {
		/*
		 	[����] �������α׷� OX ǥ���ϱ�
		 	
			          ** ������ **
			====================================
			��ȣ   �̸�   1  2  3  4  5  ����  ���     
			------------------------------------   
			1    ȫ�浿  O  X  O  O  O   80   2   
			2    ����ȭ  O  O  O  O  O   100  1
			3    ���϶�  X  X  X  X  O   20   5
			4    ���޷�  X  O  X  O  O   60   3
			5    ����ȭ  O  O  X  X  X   40   4
			------------------------------------   
			
			- �������� O , Ʋ������ Xǥ��
			- ����: O�� 20����
			- ���: ������ �������� ��������� 1��
		 */
		
		// Jumsu Ŭ���� ������ �� �ۼ�
		
		
		//1) 1�� ����ϱ�
		//Jumsu student=new Jumsu(1, "ȫ�浿", 3, 1, 3, 3, 3);
		//student.compute();
		//student.disp();
		
		
		
		//2) 5�� ����ϱ�
		Jumsu[] student= {
							 new Jumsu(1, "ȫ�浿", 3, 1, 3, 3, 3)
							,new Jumsu(2, "����ȭ", 3, 3, 3, 3, 3)
							,new Jumsu(3, "���϶�", 1, 2, 4, 4, 3)
							,new Jumsu(4, "���޷�", 4, 3, 2, 3, 3)
							,new Jumsu(5, "����ȭ", 3, 3, 1, 2, 2)
						 };
		
		//0��° ��� ���� ��� �� ���
		//student[0].compute();
		//student[0].disp();
		
		//�� 5���� ������ ����ϱ�
		for(int i=0; i<=4; i++) {
			student[i].compute();
		}//for end
		
		
		//�� ����(score)�� �������� ���(rank)���ϱ�

		for(int a=0; a<=4; a++) {
			for(int b=0; b<=4; b++) {
				if(student[a].score < student[b].score) {
					student[a].rank=student[a].rank+1;
				}//if end
			}//for end
		}//for end
		
		//�� 5���� ���� ����ϱ�
		for(int i=0; i<=4; i++) {
			student[i].disp();
		}//for end
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
