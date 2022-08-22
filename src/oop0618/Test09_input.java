package oop0618;

import java.io.*;

public class Test09_input {

	public static void main(String[] args) {
		//������ �����ͼ� ���� �б�
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			//��� ���н� '\' ��ȣ�� 2���� �ؾ� �Ѵ�
			//String fileName="D:\\java202204\\workspace\\basicJava\\src\\oop0618\\Test01_format.java";
			
			//��� ���н� '/' ��ȣ�� �����ϴ�
			String fileName="D:/java202204/workspace/basicJava/src/oop0618/Test01_format.java";
			
			//���� ��������
			fr=new FileReader(fileName);
			System.out.println("-----���� �������� ����");
			
			//���� ���� �б� (cursor�� �� ���� ����Ŵ. Begin Of File)
			br=new BufferedReader(fr);
			
			int cnt=0; //���ȣ
			while(true) {
				String line=br.readLine();//����(\n)�� �������� ���� ��������
				if(line==null) { //������ ������? End Of File
					break; //���� LOOP�� ��������
				}//if end
				System.out.println(++cnt + " " + line);
				
				//10�ึ�� ���ٱ߱�
				if(cnt%10==0) {
					System.out.println("-------------------------");
				}//if end				
				
			}//while end
			
		}catch (Exception e) {
			System.out.println("����:" + e);
		}finally {//�ڿ��ݳ�(��������)
			try {
				if(br!=null) {br.close();}
			}catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}
			}catch (Exception e) {}
		}//end
		
		
		
		

	}//main() end
}//class end
