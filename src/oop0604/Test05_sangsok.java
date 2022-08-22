package oop0604;


/*
	final class AA{}  종단클래스는 후손을 가질 수 없다
	class BB extends AA {} 에러
*/

class AA {
	private void zero() {}
	public void one() {
		System.out.println("AA.one()...");
	}//end
	public void two() {
		System.out.println("AA.two()...");
	}//end
}//class end


class BB extends AA { //자식클래스 extends 부모클래스
	public void three() {
		System.out.println("BB.three()...");
	}//end
}//class end


class CC extends BB {
	public void four() {
		System.out.println("CC.four()...");
	}//end
}//class end


/*
	class DD{}
	class EE extends DD, AA {} 에러. 클래스간의 상속은 단일상속만 가능하다
*/

//////////////////////////////////////////////////////////////////
public class Test05_sangsok {

	public static void main(String[] args) {
		//상속(Inheritance)
		/*
		   - 자원의 재활용
		   - 부모, 조상, super
		   - 자식, 후손, 파생, sub
		   - 상속 받는 방법 : 확장 extends, 구현 implements
		   - 형식) class 자식클래스 extends 부모클래스 {}		 
		 */
		
		
		AA aa=new AA();
		aa.one();
		aa.two();
		//aa.zero() 에러. private속성은 클래스 내부 접근만 허용
		System.out.println("--------------------");
		
		
		BB bb=new BB();
		bb.three();
		bb.one();
		bb.two();
		//bb.zero() 에러. private속성은 상속 안됨
		System.out.println("---------------------");
		
		CC cc=new CC();
		cc.four();
		cc.three();
		cc.two();
		cc.one();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main()end
}//class end
