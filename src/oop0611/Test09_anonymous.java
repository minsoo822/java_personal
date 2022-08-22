package oop0611;


interface IMessage{
	public void msPrint();
}//interface end


public class Test09_anonymous {

	public static void main(String[] args) {
		//익명 내부 클래스 Anonymous inner class
		//->이름이 없는 클래스 형태들
		//->필요한 곳에 일시적으로 사용
		
		
		//에러
		//IMessage msg=new IMessage();
		
		
		//추상메소드를 재정의하면 일시적으로 객체 생성 할 수 있다
		IMessage msg=new IMessage() {
			@Override
			public void msPrint() {
				System.out.println("IMessage.msgPrint()");
			}
		};
		
		msg.msPrint();
		

	}//main() end
}//class end
