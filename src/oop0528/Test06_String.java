package oop0528;

import java.util.StringTokenizer;

public class Test06_String {

	public static void main(String[] args) {
		//문자열 관련 클래스
		//String
		//StringBuffer
		//StringBuilder
		//StringTokenizer 문자열 분리
		
		
		String s1="Corona";
		String s2=new String("KOREA");
		StringBuffer  s3=new StringBuffer("SEOUL");
		StringBuilder s4=new StringBuilder("APPLE");
		
		//글자갯수
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
///////////////////////////////////////////////////////////////////////////
		
		String str=new String("Gone With The Wind");
		
		char ch=str.charAt(0); //0번쨰 문자
		System.out.println(ch);//'G'
		System.out.println(str.charAt(10)); //'T'
		
		System.out.println(str.length());   //18 글자갯수
		System.out.println(str.charAt(17)); //'d' 마지막 글자
		System.out.println(str.charAt(str.length()-1));
		
		//앞에서 부터 찾아올때
		System.out.println(str.indexOf("G"));//0   "G" 문자열의 순서값
		System.out.println(str.indexOf("e"));//3   중복되는 문자열인 경우 첫번째로 찾은 문자열의 순서값 
		System.out.println(str.indexOf("r"));//-1  일치하는 문자열이 없는 경우
		
		//뒤에서 부터 찾아올때
		System.out.println(str.lastIndexOf("W")); //14
		System.out.println(str.lastIndexOf("t")); //7
		System.out.println(str.lastIndexOf("e")); //12
		
		System.out.println(str.toLowerCase()); 		//전부 소문자로 치환
		System.out.println(str.toUpperCase());		//전부 대문자로 치환
		System.out.println(str.replace('n', 'N'));  //'n'->'N' 치환
		
		if(str.isEmpty()) { //글자 갯수가 0인지?
			System.out.println("비어있다");
		}else {
			System.out.println("비어 있지 않다");
		}//if end
		
//////////////////////////////////////////////////////////////////////////////
		
		//문자열 자르기 ★★★
		System.out.println(str.substring(5));     //"With The Wind" 5번째~문자열 마지막까지
		System.out.println(str.substring(5, 11)); //"With T"		5번째~(11-1)까지
		
		//문) "The" 자르기
		System.out.println(str.substring(10, 13));
		
		//문) 첫번째 글자만 자르기
		System.out.println(str.substring(0, 1));
		
		//문) 마지막 글자만 자르기
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		
////////////////////////////////////////////////////////////////////////////////
		
		//문자열 분리하기
		//StringTokenizer 클래스 활용 가능
		String[] word=str.split(" "); //공백을 기준으로 문자열 분리
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}//for end
		
		//문자열 맨앞과 맨뒤의 공백 제거
		System.out.println("#" +"     S K     Y     ".trim() + "#");
		
		
		//문자열 내용 비교
		String a="HAPPY";
		String b=new String("HAPPY");
		
		if(a==b) {
			System.out.println("서로 같다");
		}else {
			System.out.println("서로 다르다");
		}//if end
		
		//문자열에서 문자열 내용을 비교하고자 하는 경우, equals()함수를 이용할 것(주의)
		if(a.equals(b)) {
			System.out.println("서로 같다");
		}else {
			System.out.println("서로 다르다");
		}//if end
		
/////////////////////////////////////////////////////////////////////////////////
		
		//문자열에서 연산을 하는 경우 속도차이가 발생한다
		//String < StringBuffer < StringBuilder
		
		String s5="";
		s5=s5+"ONE";
		System.out.println(s5);
		s5=s5+"TWO";
		System.out.println(s5);
		s5=s5+"THREE";
		System.out.println(s5);
		
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("JAVA");
		System.out.println(sb1);
		sb1.append("Python");
		System.out.println(sb1);
		sb1.append("HTML");
		System.out.println(sb1);
		
		
		StringBuilder sb2=new StringBuilder();
		sb2.append("SEOUL");
		System.out.println(sb2);
		sb2.append("JEJU");
		System.out.println(sb2);
		sb2.append("BUSAN");
		System.out.println(sb2);
		
		
		//sb2의 문자열 모두를 삭제하시오
		sb2.delete(0, sb2.length());
		System.out.println(sb2.length());
		

	}//main() end
}//class end
