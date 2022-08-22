package oop0618;

import oop0618.WebProgram.Language;
import oop0618.WebProgram.Smart;

class WebProgram{ // .jsp  .php  .asp
	String title="Web Programming";
	
	class Language{
		String basic="JAVA, HTML, CSS, JavaScript, jQuery, BootStrap";
		public void display() {
			System.out.println("���ʼ��� : " + basic);
		}//display() end
	}//inner class
	
	class Smart{
		String basic="JAVA, Objective-C";
		public void display() {
			System.out.println("���ʼ��� : " + basic);
		}//display() end
	}//inner class
	
	public void print() {
		Language lang=new Language();
		lang.display();
		Smart sm=new Smart();
		sm.display();
	}//print() end
	
}//class end



//���ۻ翡�� ���� ����� ���� �÷���(OS) : �ȵ���̵�
//�ȵ���̵�OS ����� �ڹٹ������� ���������� �����ϴ� Ŭ����
class R {
	static class id{
		public static String btn="��ư";
	}//inner class end
}//class end




public class Test02_inner {

	public static void main(String[] args) {
		//����Ŭ���� inner class
		//->Ŭ�����ȿ� Ŭ������ ������ �� �ִ�
		
		
		WebProgram web=new WebProgram();
		web.print();
		
		System.out.println(R.id.btn); //id ����Ŭ���� ����
		
		
		//����. 
		//Language lang=new Language();
		
		Language lang=new WebProgram().new Language();
		lang.display();
		
		Smart sm=new WebProgram().new Smart();
		sm.display();
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
