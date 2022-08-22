package oop0611;

import java.lang.*; //�ڹ��� �⺻ ��Ű��
					//�����Ҽ� �ִ�

class Korea extends Object{ //extends Object�� ������ �� �ִ�
							//�ڹٴ� ��� Ŭ������ ObjectŬ������ ��ӹ޾ƾ� �Ѵ�
	String name="���ѹα�";
	public void disp() {
		System.out.println(this.name);
	}//disp() end
	
}//class end


class Seoul extends Korea { //extends �θ�Ŭ����
	String name="����Ư����";
	
	@Override //<- �������� �޼ҵ带 �ٽ� �ۼ�(����, ������)
	public void disp() {
			System.out.println(this.name);
	}//disp() end
	
	@Override
	public String toString() {
			return "[name=" + name + "]";
	}
	
}//class end


class Busan extends Korea {
	private String name="�λ� ������";
	private String addr="��󳲵�";
	
	public Busan() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//�ڵ��� ���� üũ�ϴ� �뵵�� ���� Ȱ��
	//toString()�Լ��� �ڵ� �ڵ� �� �� ����
	//�޴�Source->Generate toString()..
	@Override
	public String toString() {
		return "Busan [name=" + name + ", addr=" + addr + "]";
	}
		
}//class end


public class Test03_Object {

	public static void main(String[] args) {
		// Object Ŭ����
		//->�ڹ��� �ְ� ���� Ŭ����
		//->java.lang ��Ű���� ����Ǿ� ����
		//->�ڹ��� ��� Ŭ������ ObjectŬ������ �ļյ��̴�(�´�)
		
		//JavaSE API
		//https://docs.oracle.com/javase/8/docs/api/
		
		//���
		//->�θ�� �ڽ�, ����� �ļ�, super�� sub
		//->extends		Ȯ��
		//->implements	����
		
		
		Seoul se=new Seoul();
		se.disp();
		System.out.println(se.toString());
		System.out.println(se); //toString()�Լ����� �����ϸ鼭 ȣ�Ⱑ���ϴ�
		
		
		Busan bu=new Busan();
		System.out.println(bu.toString());
		System.out.println(bu);
		

		
	}//main() end
}//class end
