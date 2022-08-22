package oop0604;


class School{
	
	public String name="학교";
	
	public final void view() {
		System.out.println("School.view()...");
	}//view end
	
	public void disp() {
		System.out.println("School.disp()...");
	}//disp end
	
}//class end

class MiddleSchool extends School {
	//1)오버라이드 하기 전
}//class end


class HighSchool extends School {
	//2)오버라이드 한 후
	String name="고등학교";
	
	@Override //<- annotation
	public void disp() {
		System.out.println("HighSchool.disp()" + name);
	}//disp() end

	
	/* 에러. final 메소드는 오버라이드 할 수 없다
	   @Override //<- annotation
	   public void view() {}
	*/
}//class end


//////////////////////////////////////////////////////

public class Test06_overridr {

	public static void main(String[] args) {
		//메소드 오버라이드(method Override)
		//->물려받은 메소드를 다시 작성(재정의, 리폼)
		
		
		//1)오버라이드 하기 전
		//->부모가 물려준 값 그대로 사용
		MiddleSchool ms=new MiddleSchool();
		System.out.println(ms.name);
		ms.view();
		ms.disp();
				
		
		//2)오버라이드 한 후
		HighSchool hs=new HighSchool();
		System.out.println(hs.name);
		hs.view();
		hs.disp();
		
		

	}//main() end
}//class end
