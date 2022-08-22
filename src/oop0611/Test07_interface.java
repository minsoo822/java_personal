package oop0611;


interface Creature {
	//void disp() {} 에러. 일반메소드는 사용불가
	abstract void kind(); //추상메소드만 가능하다
	void breathe();		  //abstract 생략가능
}//interface end


//클래스 입장에서 부모가 클래스    : extends 확장
//클래스 입장에서 부모가 인터페이스 : implements 구현
class Tiger implements Creature { //인터페이스 부모를 상속받을때 implements

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breathe() {
		System.out.println("허파");
	}
	
}//class end


class Salmon implements Creature {

	@Override
	public void kind() {
		System.out.println("어류");
	}

	@Override
	public void breathe() {
		System.out.println("아가미");
	}
	
}//class end



public class Test07_interface {

	public static void main(String[] args) {
		//인터페이스 interface
		/*
		    - 추상메소드만 가능하다
		    - 추상클래스보다 더 추상화 되어 있다
		    - implements 구현 : 클래스가 인터페이스를 상속받을때 		 
		 */
		
		
		//Creature creature=new Creature(); 에러. 인터페이스는 직접 객체 생성 불가능
		
		
		//인터페이스의 다형성
		Creature creature=new Tiger();
		creature.kind();
		creature.breathe();
		
		creature=new Salmon();
		creature.kind();
		creature.breathe();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
