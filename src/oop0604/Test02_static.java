package oop0604;

public class Test02_static {

	public static void main(String[] args) {
		//static
		//->����
		//->����, �Լ�
		//->new �����ڸ� ������ �� �ִ�(������ ��ü ���� ���� ��� �����ϴ�)
		//->���ٹ�� : Ŭ������.����
		//			 Ŭ������.�Լ�()
		
		
		//Math math=new Math() ����
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		System.out.println(Math.max(2, 4));
		
		
		System.out.println(Integer.min(2, 4));
		System.out.println(Integer.parseInt("123"));	    //"123" -> 123
		System.out.println(Integer.toBinaryString(15));     //2����
		System.out.println(Integer.toOctalString(15));	    //8����
		System.out.println(Integer.toHexString(15));	    //16����
		
		
		System.out.println(Character.isAlphabetic(65));     //65���� ���ĺ����� ��ȯ��������?
		System.out.println(Character.toLowerCase('R'));  
		System.out.println(Character.getNumericValue('3')); //'3' -> 3
		System.out.println(Character.toString('3'));		//'3' -> "3"
		
		
		
	}//main() end
}//class end
