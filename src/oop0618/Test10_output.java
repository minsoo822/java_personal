package oop0618;

import java.io.*;

public class Test10_output {

	public static void main(String[] args) {
		//���Ͽ� ����ϱ�
		
		FileWriter fw=null;
		
		try {
			
			String fileName="D:/java202204/sungjuk.txt";
			//���� ���� ��忡��
			//�ش�����(sungjuk.txt)�� �������� ������ ����(create)
			//�ش�����(sungjuk.txt)�� �����ϸ� ����(overwrite �Ǵ� append)
	
			//true �߰�, false �����
			fw=new FileWriter(fileName, false);
			
			//true ����Ŭ����
			PrintWriter out=new PrintWriter(fw, true);
			out.println("�����,90,95,100");
			out.println("������,80,95,85");
			out.println("�迬��,20,50,10");
			out.println("������,60,80,75");
			out.println("���޷�,10,25,30");
			out.close();//�ڿ��ݳ�
			
			System.out.println("sungjuk.txt �ϼ�!!");
			
		}catch (Exception e) {
			System.out.println("����:"+e);
		}finally {
			try {
				if(fw!=null) {fw.close();}
			}catch (Exception e) {}			
		}//end
		
		
		

	}//main() end
}//class end
