package oop0618;

import java.io.*;

public class Test11_sungjuk {

	public static void main(String[] args) {
		//�������α׷�
		//������ ���� ���� : sungjuk.txt
		//���� ��� ���� : result.txt
		/*
		                       �� / �� / �� / ��
           --------------------------------------------------------
           �̸�   ����  ����  ����  ��� ���   ���
           --------------------------------------------------------
           ����ȭ 100  100  100  100  1    �հ�   ********** ���л�
           ȫ�浿  20   50   30   33  5    ���հ�  ***
           ������  90   95   90   91  2    �հ�   *********
           ���޷�  70   80   60   70  4    �հ�   *******
           ���϶�  35  100  100   78  3    �����  *******
           --------------------------------------------------------		
		*/

		String inName ="D:/java202204/sungjuk.txt";
		String outName="D:/java202204/result.txt";
		
		
		//���� �б� ���
		FileReader fr=null;
		BufferedReader br=null;
		
		//���� ���� ���
		FileWriter fw=null;
		PrintWriter out=null;
		
		try {
			
			//1)result.txt�� ���� ����ϱ�
			fw =new FileWriter(outName, false);
			out=new PrintWriter(fw, true);
			out.println("��/��/��/��/");
			out.println("--------------------------------------------");
			out.println("�̸�   ����   ����   ����   ���   ���   ���");
			out.println("--------------------------------------------");
			
			
			
			//2)������ ������ �ʿ��� ���� ����
			String[] name=new String[5];
			int[] kor =new int[5];
			int[] eng =new int[5];
			int[] mat =new int[5];
			int[] aver=new int[5];
			int[] rank= {1, 1, 1, 1, 1};
			
			
			//3)sungjuk.txt�� �ִ� �����͸� ���ٴ���(\n)�� �����ͼ� 2)���� ������ ���� ����
			fr=new FileReader(inName);
			br=new BufferedReader(fr);
			
			int i=0;
			while(true) {
				String line=br.readLine(); //"�����,90,95,100"
				if(line==null) {
					break;
				}//if end
				
				//4) , ��ȣ�� �������� sprit()�̿��ؼ� ���ڿ� �и��ؼ� �迭�� ������� �����ϱ�
				//����) StringTokenizer Ŭ������ �̿��ؼ� ���ڿ� �и��ϱ�
				String[] word=line.split(",");
				name[i]=word[0]; //"�����"
				kor[i] =Integer.parseInt(word[1]); //"90"
				eng[i] =Integer.parseInt(word[2]); //"95"
				mat[i] =Integer.parseInt(word[3]); //"100"
				i++;
			}//while end
			
			
			//5)����� ���Ͻÿ�
			for(i=0; i<5; i++) {
				aver[i]=(kor[i]+eng[i]+mat[i])/3;
			}//for end
			
			
			//6)����� ���Ͻÿ�
			for(int a=0; a<5; a++) {
				for(int b=0; b<5; b++) {
					if(aver[a]<aver[b]) {
						rank[a]++;
					}//if end
				}//for end
			}//for end
			
			
			
			//7)result.txt�� ��� ����ϱ�
			for(i=0; i<5; i++) {
				out.printf("%-5s %5d %5d %5d %5d %5d", name[i], kor[i], eng[i], mat[i], aver[i], rank[i]);
				
				if(aver[i]>=70) {
					if(kor[i]<40 || eng[i]<40 || mat[i]<40) {
						out.printf("%-8s", " ����� ");
					}else {
						out.printf("%-8s", " �� �� ");
					}//if end
				}else {
					out.printf("%-8s", " ���հ� ");
				}//if end
				
				//��� 10���� * �Ѱ���
				for(int star=0; star<aver[i]/10; star++) {
					out.printf("%c", '*');
				}//for end
				
				if(aver[i]>=95) {
					out.printf("%10s", "���л�");
				}//if end
				
				out.println(); //�ٹٲ�
			}//for end
			
			System.out.println("result.txt ���� ��� �ϼ�!!");
			
		}catch (Exception e) {
			System.out.println("����:"+e);
		}finally {//�ڿ��ݳ�
			try {
				if(br!=null) {br.close();}
			}catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}
			}catch (Exception e) {}
			try {
				if(out!=null) {out.close();}
			}catch (Exception e) {}
			try {
				if(fw!=null) {fw.close();}
			}catch (Exception e) {}
		}//end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
