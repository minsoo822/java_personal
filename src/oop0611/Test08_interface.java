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


//����. Ŭ�����鰣�� ����� ���� ��Ӹ� �����ϴ�
//class Test extends Unit, School{}

//�������̽��� ���� ����� ���߻���� �����ϴ�
interface Fightable extends Movable, Attackable {} //interface end


class Fight extends Unit implements Fightable {

	@Override
	public void attack(Unit u) {}

	@Override
	public void move(int x, int y) {}
	
} //class end


//Ŭ���� ���忡�� �θ� Ŭ������ ���ϻ�Ӹ� �����ϰ�(extends)
//            �θ� �������̽��� ���߱����� �����ϴ�(implements)
class  Tetris extends Unit implements Movable, Attackable {
	@Override
	public void attack(Unit u) {}
	@Override
	public void move(int x, int y) {}
}//class end



public class Test08_interface {

	public static void main(String[] args) {
		//Ŭ������ �������̽��� ���
	}//main() end
}//class end
