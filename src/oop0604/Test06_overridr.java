package oop0604;


class School{
	
	public String name="�б�";
	
	public final void view() {
		System.out.println("School.view()...");
	}//view end
	
	public void disp() {
		System.out.println("School.disp()...");
	}//disp end
	
}//class end

class MiddleSchool extends School {
	//1)�������̵� �ϱ� ��
}//class end


class HighSchool extends School {
	//2)�������̵� �� ��
	String name="����б�";
	
	@Override //<- annotation
	public void disp() {
		System.out.println("HighSchool.disp()" + name);
	}//disp() end

	
	/* ����. final �޼ҵ�� �������̵� �� �� ����
	   @Override //<- annotation
	   public void view() {}
	*/
}//class end


//////////////////////////////////////////////////////

public class Test06_overridr {

	public static void main(String[] args) {
		//�޼ҵ� �������̵�(method Override)
		//->�������� �޼ҵ带 �ٽ� �ۼ�(������, ����)
		
		
		//1)�������̵� �ϱ� ��
		//->�θ� ������ �� �״�� ���
		MiddleSchool ms=new MiddleSchool();
		System.out.println(ms.name);
		ms.view();
		ms.disp();
				
		
		//2)�������̵� �� ��
		HighSchool hs=new HighSchool();
		System.out.println(hs.name);
		hs.view();
		hs.disp();
		
		

	}//main() end
}//class end
