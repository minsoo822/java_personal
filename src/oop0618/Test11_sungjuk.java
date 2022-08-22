package oop0618;

import java.io.*;

public class Test11_sungjuk {

	public static void main(String[] args) {
		//성적프로그램
		//데이터 저장 파일 : sungjuk.txt
		//성적 결과 파일 : result.txt
		/*
		                       성 / 적 / 결 / 과
           --------------------------------------------------------
           이름   국어  영어  수학  평균 등수   결과
           --------------------------------------------------------
           무궁화 100  100  100  100  1    합격   ********** 장학생
           홍길동  20   50   30   33  5    불합격  ***
           개나리  90   95   90   91  2    합격   *********
           진달래  70   80   60   70  4    합격   *******
           라일락  35  100  100   78  3    재시험  *******
           --------------------------------------------------------		
		*/

		String inName ="D:/java202204/sungjuk.txt";
		String outName="D:/java202204/result.txt";
		
		
		//파일 읽기 모드
		FileReader fr=null;
		BufferedReader br=null;
		
		//파일 쓰기 모드
		FileWriter fw=null;
		PrintWriter out=null;
		
		try {
			
			//1)result.txt에 제목 출력하기
			fw =new FileWriter(outName, false);
			out=new PrintWriter(fw, true);
			out.println("성/적/결/과/");
			out.println("--------------------------------------------");
			out.println("이름   국어   영어   수학   평균   등수   결과");
			out.println("--------------------------------------------");
			
			
			
			//2)데이터 가공에 필요한 변수 선언
			String[] name=new String[5];
			int[] kor =new int[5];
			int[] eng =new int[5];
			int[] mat =new int[5];
			int[] aver=new int[5];
			int[] rank= {1, 1, 1, 1, 1};
			
			
			//3)sungjuk.txt에 있는 데이터를 한줄단위(\n)로 가져와서 2)에서 선언한 변수 저장
			fr=new FileReader(inName);
			br=new BufferedReader(fr);
			
			int i=0;
			while(true) {
				String line=br.readLine(); //"손흥민,90,95,100"
				if(line==null) {
					break;
				}//if end
				
				//4) , 기호를 기준으로 sprit()이용해서 문자열 분리해서 배열에 순서대로 저장하기
				//과제) StringTokenizer 클래스를 이용해서 문자열 분리하기
				String[] word=line.split(",");
				name[i]=word[0]; //"손흥민"
				kor[i] =Integer.parseInt(word[1]); //"90"
				eng[i] =Integer.parseInt(word[2]); //"95"
				mat[i] =Integer.parseInt(word[3]); //"100"
				i++;
			}//while end
			
			
			//5)평균을 구하시오
			for(i=0; i<5; i++) {
				aver[i]=(kor[i]+eng[i]+mat[i])/3;
			}//for end
			
			
			//6)등수를 구하시오
			for(int a=0; a<5; a++) {
				for(int b=0; b<5; b++) {
					if(aver[a]<aver[b]) {
						rank[a]++;
					}//if end
				}//for end
			}//for end
			
			
			
			//7)result.txt에 결과 출력하기
			for(i=0; i<5; i++) {
				out.printf("%-5s %5d %5d %5d %5d %5d", name[i], kor[i], eng[i], mat[i], aver[i], rank[i]);
				
				if(aver[i]>=70) {
					if(kor[i]<40 || eng[i]<40 || mat[i]<40) {
						out.printf("%-8s", " 재시험 ");
					}else {
						out.printf("%-8s", " 합 격 ");
					}//if end
				}else {
					out.printf("%-8s", " 불합격 ");
				}//if end
				
				//평균 10점당 * 한개씩
				for(int star=0; star<aver[i]/10; star++) {
					out.printf("%c", '*');
				}//for end
				
				if(aver[i]>=95) {
					out.printf("%10s", "장학생");
				}//if end
				
				out.println(); //줄바꿈
			}//for end
			
			System.out.println("result.txt 성적 결과 완성!!");
			
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}finally {//자원반납
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
