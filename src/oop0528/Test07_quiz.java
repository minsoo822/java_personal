package oop0528;

public class Test07_quiz {

	public static void main(String[] args) {
		//문제) 
		//아래 pathName에서 파일명과 확장명을 분리하고 
		//확장명이 이미지 파일(,png ,jpg ,gif)인지 확인하시오   (과제)
		//출력결과
		//-> 파일명 : sky2022.05.28
		//-> 확장명 : png
		
		String pathName="c:/myphoto/sky2022.05.28.png";
		
		int lastSlash=pathName.lastIndexOf("/");//마지막 / 문자의 위치
		int lastDot	 =pathName.lastIndexOf(".");//마지막 . 문자의 위치
		System.out.println(lastSlash); //10
		System.out.println(lastDot);   //24
		
		//String file=pathName.substring(11, 24);
		String file=pathName.substring(lastSlash+1, lastDot);
		System.out.println(file);
		
		//String ext=pathName.substring(25);
		String ext=pathName.substring(lastDot+1);
		System.out.println(ext);
		
		
	}//main() end
}//class end
