package oop0604;

public class Jumsu {
	//������� field
	private int no;					 //��ȣ
	private String name;			 //�̸�
	private char[] ox=new char[5];	 //OXǥ��
	private int[] answer=new int[5]; //�������
	
	public int score;				 //����
	public int rank;				 //���
	
	//������ �Լ� constructor
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
	
		
	//����Լ� method
	public void compute() {
		//������ ���(answer)�� ������ ���ؼ�
		//OX�� ǥ���ϰ�(ox), ���� ������ ���� ���� ���ϱ�(score)
		
		int[] dap= {3, 3, 3, 3, 3}; //����
		
		for(int i=0; i<=4; i++) {
			if(answer[i]==dap[i]) {
				//�¾�����
				ox[i]='o';
				score=score+20;
			}else {
				//Ʋ������
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
		System.out.println();//�ٹٲ�
	}//disp() end
	
	
}//class end





















