package oop0430;

public class Test06_operator {

	public static void main(String[] args) {
		//������ Operator
		//->�̽ļ��� ǳ���ϴ�
		//->�ֿ켱 ������  : ()
		//->�ļ��� ������  : = ���Կ�����
		//->������ �켱���� :  ��� -> �� -> ��
		
		//1. ���������
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3); //1 ��
		System.out.println(5%3); //2 ������

		System.out.println(3/5); //0
		System.out.println(3%5); //3
		
		System.out.println(3.0/5.0); //0.6
		System.out.println(3/5.0);   //0.6
		System.out.println(3.0/5);   //0.6
		System.out.println(3/5.);    //0.6
		
///////////////////////////////////////////////////////////
		
		//2.��(����)������
		//->������� boolean������ ��ȯ�Ѵ�
		System.out.println(5<3);
		System.out.println(5>3);
		System.out.println(5<=3);
		System.out.println(5>=3);
		System.out.println(5!=3); //���� �ʴ�
		System.out.println(5==3); //����
		
///////////////////////////////////////////////////////////
				
		//3.��������
		//->������ 2���̻��� ���� ��� ��ü������ �Ǵ�
		//->������� boolean������ ��ȯ�ȴ�
		//->AND, OR, NOT
		
		//1)AND
		//->���� ������
		//->�׸���, ~�̸鼭
		//->��� ������ true�϶� true�� �Ǵ�
		//-> &&
		System.out.println(3<5 && 2>4);
		               //  true   false
		               //  false
		
		//2)OR
		//->���� ������
		//->�Ǵ�, ~�̰ų�
		//->������ �ϳ��� true�̸� true�� �Ǵ�
		//-> ||
		System.out.println(3<5 || 2>4);
		               //  true   false
		               //  true
		
		//3)NOT ������
		//-> �� ���� ������
		//-> ~�ƴ϶��
		//-> !
		boolean flag=false;
		System.out.println(!flag);
		
		

	}//main() end
}//class end
