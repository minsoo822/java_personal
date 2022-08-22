package oop0521;

public class Test03_quiz {

	public static void main(String[] args) {
		//�迭 ���� ��������
		
		int[] num= {7, 8, -9, 6, -5};
		int size=num.length; //5
		
		//��1)�迭��Ұ��� ���� ���Ͻÿ�
		//    num[0] + num[1] + num[2] + num[3] + num[4]
		int hap=0;
		for(int i=0; i<size; i=i+1) {
			hap=hap+num[i];
		}//for end
		System.out.println(hap);
		
///////////////////////////////////////////////////////////////		
				
		//��2)������ ������ ���Ͻÿ�
		/*
		   7<0      if(num[0]<0)
		   8<0      if(num[1]<0)
		   -9<0     if(num[2]<0) count=0+1
		   6<0      if(num[3]<0)
		   -5<0     if(num[4]<0) count=1+1
		 */
		int count=0;
		for(int i=0; i<size; i=i+1) {
			if(num[i]<0) {
				count=count+1;
			}//if end
		}//for end
		System.out.println(count);
		
/////////////////////////////////////////////////////////////////		
		
		//��3)����߿��� ¦���� ���� ���Ͻÿ�
		int even=0;
		for(int i=0; i<size; i++) {
			if(num[i]>0 && num[i]%2==0) {
				even=even+num[i]; //even+=num[i]
			}//if end
		}//for end
		System.out.println(even);
		
//////////////////////////////////////////////////////////////////		
		
		//��4)num[3]�� ����� ���Ͻÿ�(7, 8, -9, 6, -5)
		/*
		   6<7   if(num[3]<num[0]) r=1+1
		   6<8   if(num[3]<num[1]) r=2+1
		   6<-9	 if(num[3]<num[2]) 
		   6<6   if(num[3]<num[3])
		   6<-5  if(num[3]<num[4])
		 
		 
		 */
		int r=1;
		for(int i=0; i<size; i++) {
			if(num[3]<num[i]) {
				r=r+1;
			}//if end
		}//for end
		System.out.println(r);
		
/////////////////////////////////////////////////////////////
		
		//��5) num�迭����� ������ ����� ��� ���Ͻÿ�(7, 8, -9, 6, -5)
		int[] rank= {1, 1, 1, 1, 1};
		/*
		 7<7    if(num[0]<num[0])
		 7<8    if(num[0]<num[1]) rank[0]=rank[0]+1
		 7<-9   if(num[0]<num[2])
		 7<6    if(num[0]<num[3])
		 7<-5   if(num[0]<num[4])
		 
		 8<7    if(num[0]<num[0])
		 8<8    if(num[0]<num[1]) 
		 8<-9   if(num[0]<num[2])
		 8<6    if(num[0]<num[3])
		 8<-5   if(num[0]<num[4])
		 
		 -9<7    if(num[0]<num[0]) rank[2]=rank[2]+1
		 -9<8    if(num[0]<num[1]) rank[2]=rank[2]+1
		 -9<-9   if(num[0]<num[2])
		 -9<6    if(num[0]<num[3]) rank[2]=rank[2]+1
		 -9<-5   if(num[0]<num[4]) rank[2]=rank[2]+1
		 
		 */
		
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(num[a] < num[b]) {
					rank[a]=rank[a]+1;
				}//if end
			}//for end
		}//for end
		
		for(int i=0; i<size; i=i+1) {
			System.out.println(num[i] + " ��� : " + rank[i]);
		}//for end
		
		
		
		
		
		
	}//main() end
}//class end
