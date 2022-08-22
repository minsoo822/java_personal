package oop0604;


/*
	final class AA{}  ����Ŭ������ �ļ��� ���� �� ����
	class BB extends AA {} ����
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


class BB extends AA { //�ڽ�Ŭ���� extends �θ�Ŭ����
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
	class EE extends DD, AA {} ����. Ŭ�������� ����� ���ϻ�Ӹ� �����ϴ�
*/

//////////////////////////////////////////////////////////////////
public class Test05_sangsok {

	public static void main(String[] args) {
		//���(Inheritance)
		/*
		   - �ڿ��� ��Ȱ��
		   - �θ�, ����, super
		   - �ڽ�, �ļ�, �Ļ�, sub
		   - ��� �޴� ��� : Ȯ�� extends, ���� implements
		   - ����) class �ڽ�Ŭ���� extends �θ�Ŭ���� {}		 
		 */
		
		
		AA aa=new AA();
		aa.one();
		aa.two();
		//aa.zero() ����. private�Ӽ��� Ŭ���� ���� ���ٸ� ���
		System.out.println("--------------------");
		
		
		BB bb=new BB();
		bb.three();
		bb.one();
		bb.two();
		//bb.zero() ����. private�Ӽ��� ��� �ȵ�
		System.out.println("---------------------");
		
		CC cc=new CC();
		cc.four();
		cc.three();
		cc.two();
		cc.one();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main()end
}//class end
