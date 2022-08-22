package oop0618;

import java.io.*;

public class Test10_output {

	public static void main(String[] args) {
		//파일에 출력하기
		
		FileWriter fw=null;
		
		try {
			
			String fileName="D:/java202204/sungjuk.txt";
			//파일 쓰기 모드에서
			//해당파일(sungjuk.txt)에 존재하지 않으면 생성(create)
			//해당파일(sungjuk.txt)이 존재하면 선택(overwrite 또는 append)
	
			//true 추가, false 덮어쓰기
			fw=new FileWriter(fileName, false);
			
			//true 버퍼클리어
			PrintWriter out=new PrintWriter(fw, true);
			out.println("손흥민,90,95,100");
			out.println("박지성,80,95,85");
			out.println("김연아,20,50,10");
			out.println("개나리,60,80,75");
			out.println("진달래,10,25,30");
			out.close();//자원반납
			
			System.out.println("sungjuk.txt 완성!!");
			
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}finally {
			try {
				if(fw!=null) {fw.close();}
			}catch (Exception e) {}			
		}//end
		
		
		

	}//main() end
}//class end
