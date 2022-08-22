package oop0618;

import oop0618.WebProgram.Language;
import oop0618.WebProgram.Smart;

class WebProgram{ // .jsp  .php  .asp
	String title="Web Programming";
	
	class Language{
		String basic="JAVA, HTML, CSS, JavaScript, jQuery, BootStrap";
		public void display() {
			System.out.println("기초수업 : " + basic);
		}//display() end
	}//inner class
	
	class Smart{
		String basic="JAVA, Objective-C";
		public void display() {
			System.out.println("기초수업 : " + basic);
		}//display() end
	}//inner class
	
	public void print() {
		Language lang=new Language();
		lang.display();
		Smart sm=new Smart();
		sm.display();
	}//print() end
	
}//class end



//구글사에서 만든 모바일 전용 플랫폼(OS) : 안드로이드
//안드로이드OS 기반의 자바문법에서 구조적으로 지원하는 클래스
class R {
	static class id{
		public static String btn="버튼";
	}//inner class end
}//class end




public class Test02_inner {

	public static void main(String[] args) {
		//내부클래스 inner class
		//->클래스안에 클래스를 선언할 수 있다
		
		
		WebProgram web=new WebProgram();
		web.print();
		
		System.out.println(R.id.btn); //id 내부클래스 접근
		
		
		//에러. 
		//Language lang=new Language();
		
		Language lang=new WebProgram().new Language();
		lang.display();
		
		Smart sm=new WebProgram().new Smart();
		sm.display();
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
