package oop0604;

/*
final class Animal{} //����Ŭ����. �ļ�Ŭ������ ���� �� ����
class Elephant extends Animal {} ����.
*/

class Fruit{
	void view() {}
	final void disp() {}
}//class end

class Apple extends Fruit{
	
	@Override		//<- annotation
	void view() {}	//<- ��� ���� �Լ��� ������(����, �������̵�)
	
	/* ����. ��ӹ��� final �޼ҵ�� ���̻� �������̵� �� �� ����
		@Override
		void disp() {}
	*/
	
}//class end


public class Test04_final {

	public static void main(String[] args) {
		//final ������
		//->����, �Լ�, Ŭ����
		
		int a=3;
		a=5;
		System.out.println(a);
		
		
		final int b=2; //final (������ ���ȭ)
		//b=4; ����. final������ �ٸ������� ���� �� ����
		

	}//main() end
}//class end
