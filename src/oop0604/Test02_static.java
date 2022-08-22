package oop0604;

public class Test02_static {

	public static void main(String[] args) {
		//static
		//->정적
		//->변수, 함수
		//->new 연산자를 생략할 수 있다(별도의 객체 선언 없이 사용 가능하다)
		//->접근방법 : 클래스명.변수
		//			 클래스명.함수()
		
		
		//Math math=new Math() 에러
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		System.out.println(Math.max(2, 4));
		
		
		System.out.println(Integer.min(2, 4));
		System.out.println(Integer.parseInt("123"));	    //"123" -> 123
		System.out.println(Integer.toBinaryString(15));     //2진수
		System.out.println(Integer.toOctalString(15));	    //8진수
		System.out.println(Integer.toHexString(15));	    //16진수
		
		
		System.out.println(Character.isAlphabetic(65));     //65값이 알파벳으로 변환가능한지?
		System.out.println(Character.toLowerCase('R'));  
		System.out.println(Character.getNumericValue('3')); //'3' -> 3
		System.out.println(Character.toString('3'));		//'3' -> "3"
		
		
		
	}//main() end
}//class end
