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
		//��Ӱ��迡�� ������ �Լ� ȣ�� ����
		//->�θ� ������ �Լ� ȣ�� ��, �ڽ��� ������ �Լ��� ȣ��ȴ�

		
		//GrandFather() -> Father()
		Father fa=new Father();
		
		//GrandFather() -> Father() -> Son()
		Son son=new Son();
		
		
	}//main end
}//class end
