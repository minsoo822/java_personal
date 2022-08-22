package oop0528;

import java.util.StringTokenizer;

public class Test06_String {

	public static void main(String[] args) {
		//���ڿ� ���� Ŭ����
		//String
		//StringBuffer
		//StringBuilder
		//StringTokenizer ���ڿ� �и�
		
		
		String s1="Corona";
		String s2=new String("KOREA");
		StringBuffer  s3=new StringBuffer("SEOUL");
		StringBuilder s4=new StringBuilder("APPLE");
		
		//���ڰ���
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
///////////////////////////////////////////////////////////////////////////
		
		String str=new String("Gone With The Wind");
		
		char ch=str.charAt(0); //0���� ����
		System.out.println(ch);//'G'
		System.out.println(str.charAt(10)); //'T'
		
		System.out.println(str.length());   //18 ���ڰ���
		System.out.println(str.charAt(17)); //'d' ������ ����
		System.out.println(str.charAt(str.length()-1));
		
		//�տ��� ���� ã�ƿö�
		System.out.println(str.indexOf("G"));//0   "G" ���ڿ��� ������
		System.out.println(str.indexOf("e"));//3   �ߺ��Ǵ� ���ڿ��� ��� ù��°�� ã�� ���ڿ��� ������ 
		System.out.println(str.indexOf("r"));//-1  ��ġ�ϴ� ���ڿ��� ���� ���
		
		//�ڿ��� ���� ã�ƿö�
		System.out.println(str.lastIndexOf("W")); //14
		System.out.println(str.lastIndexOf("t")); //7
		System.out.println(str.lastIndexOf("e")); //12
		
		System.out.println(str.toLowerCase()); 		//���� �ҹ��ڷ� ġȯ
		System.out.println(str.toUpperCase());		//���� �빮�ڷ� ġȯ
		System.out.println(str.replace('n', 'N'));  //'n'->'N' ġȯ
		
		if(str.isEmpty()) { //���� ������ 0����?
			System.out.println("����ִ�");
		}else {
			System.out.println("��� ���� �ʴ�");
		}//if end
		
//////////////////////////////////////////////////////////////////////////////
		
		//���ڿ� �ڸ��� �ڡڡ�
		System.out.println(str.substring(5));     //"With The Wind" 5��°~���ڿ� ����������
		System.out.println(str.substring(5, 11)); //"With T"		5��°~(11-1)����
		
		//��) "The" �ڸ���
		System.out.println(str.substring(10, 13));
		
		//��) ù��° ���ڸ� �ڸ���
		System.out.println(str.substring(0, 1));
		
		//��) ������ ���ڸ� �ڸ���
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		
////////////////////////////////////////////////////////////////////////////////
		
		//���ڿ� �и��ϱ�
		//StringTokenizer Ŭ���� Ȱ�� ����
		String[] word=str.split(" "); //������ �������� ���ڿ� �и�
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}//for end
		
		//���ڿ� �Ǿհ� �ǵ��� ���� ����
		System.out.println("#" +"     S K     Y     ".trim() + "#");
		
		
		//���ڿ� ���� ��
		String a="HAPPY";
		String b=new String("HAPPY");
		
		if(a==b) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� �ٸ���");
		}//if end
		
		//���ڿ����� ���ڿ� ������ ���ϰ��� �ϴ� ���, equals()�Լ��� �̿��� ��(����)
		if(a.equals(b)) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� �ٸ���");
		}//if end
		
/////////////////////////////////////////////////////////////////////////////////
		
		//���ڿ����� ������ �ϴ� ��� �ӵ����̰� �߻��Ѵ�
		//String < StringBuffer < StringBuilder
		
		String s5="";
		s5=s5+"ONE";
		System.out.println(s5);
		s5=s5+"TWO";
		System.out.println(s5);
		s5=s5+"THREE";
		System.out.println(s5);
		
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("JAVA");
		System.out.println(sb1);
		sb1.append("Python");
		System.out.println(sb1);
		sb1.append("HTML");
		System.out.println(sb1);
		
		
		StringBuilder sb2=new StringBuilder();
		sb2.append("SEOUL");
		System.out.println(sb2);
		sb2.append("JEJU");
		System.out.println(sb2);
		sb2.append("BUSAN");
		System.out.println(sb2);
		
		
		//sb2�� ���ڿ� ��θ� �����Ͻÿ�
		sb2.delete(0, sb2.length());
		System.out.println(sb2.length());
		

	}//main() end
}//class end
