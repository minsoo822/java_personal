package oop0611;


class Unit {
	int currentHP;
	int x, y;
}//class end

interface Movable{
	void move(int x, int y);
}//interface end

interface Attackable{
	void attack(Unit u);
}//interface end


//에러. 클래스들간의 상속은 단일 상속만 가능하다
//class Test extends Unit, School{}

//인터페이스들 간의 상속은 다중상속이 가능하다
interface Fightable extends Movable, Attackable {} //interface end


class Fight extends Unit implements Fightable {

	@Override
	public void attack(Unit u) {}

	@Override
	public void move(int x, int y) {}
	
} //class end


//클래스 입장에서 부모가 클래스면 단일상속만 가능하고(extends)
//            부모가 인터페이스면 다중구현이 가능하다(implements)
class  Tetris extends Unit implements Movable, Attackable {
	@Override
	public void attack(Unit u) {}
	@Override
	public void move(int x, int y) {}
}//class end



public class Test08_interface {

	public static void main(String[] args) {
		//클래스와 인터페이스의 상속
	}//main() end
}//class end
