package oop0604;


class GrandFather {
	public GrandFather() {
		System.out.println("GrandFather()...");
	}//end
}//class end

class Father extends GrandFather {
	public Father() {
		System.out.println("Father()...");
	}//end
}//class end

class Son extends Father {
	public Son() {
		System.out.println("Son()...");
	}//end
}//class end


///////////////////////////////////////////////////////

public class Test07_constructor {

	public static void main(String[] args) {
		//상속관계에서 생성자 함수 호출 순서
		//->부모 생성자 함수 호출 후, 자신의 생성자 함수가 호출된다

		
		//GrandFather() -> Father()
		Father fa=new Father();
		
		//GrandFather() -> Father() -> Son()
		Son son=new Son();
		
		
	}//main end
}//class end
