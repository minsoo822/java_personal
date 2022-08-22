package oop0618;

import java.io.*;

public class Test09_input {

	public static void main(String[] args) {
		//파일을 가져와서 내용 읽기
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			//경로 구분시 '\' 기호는 2번씩 해야 한다
			//String fileName="D:\\java202204\\workspace\\basicJava\\src\\oop0618\\Test01_format.java";
			
			//경로 구분시 '/' 기호도 가능하다
			String fileName="D:/java202204/workspace/basicJava/src/oop0618/Test01_format.java";
			
			//파일 가져오기
			fr=new FileReader(fileName);
			System.out.println("-----파일 가져오기 성공");
			
			//파일 내용 읽기 (cursor가 맨 앞을 가리킴. Begin Of File)
			br=new BufferedReader(fr);
			
			int cnt=0; //행번호
			while(true) {
				String line=br.readLine();//엔터(\n)를 기준으로 한줄 가져오기
				if(line==null) { //파일의 끝인지? End Of File
					break; //무한 LOOP를 빠져나옴
				}//if end
				System.out.println(++cnt + " " + line);
				
				//10행마다 밑줄긋기
				if(cnt%10==0) {
					System.out.println("-------------------------");
				}//if end				
				
			}//while end
			
		}catch (Exception e) {
			System.out.println("실패:" + e);
		}finally {//자원반납(순서주의)
			try {
				if(br!=null) {br.close();}
			}catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}
			}catch (Exception e) {}
		}//end
		
		
		
		

	}//main() end
}//class end
