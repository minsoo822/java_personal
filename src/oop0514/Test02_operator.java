package oop0514;

public class Test02_operator {

	public static void main(String[] args) {
		//���Կ���
		int a=3;
		a=a+1;
		System.out.println(a); //4
		
		a+=1;
		System.out.println(a); //5
		
		a=a-2;
		System.out.println(a); //3
		
		a-=2;
		System.out.println(a); //3
		
		a*=5;
		System.out.println(a); //5
		
		a/=5;
		System.out.println(a); //1
		
		a%=3;
		System.out.println(a); //a=1%3
//////////////////////////////////////////////////////////////////
		
		
		System.out.println("-----------");
		
		//1���� ������
		int b=3;
		b=b+1;
		b+=1;
		b++;
		++b;
		System.out.println(b); //7
		
		
		//1���� ������
		int c=3;
		c=c-1;
		c-=1;
		c--;
		--c;
		System.out.println(c); //-1
		
		//1���������ڴ� ���İ� �ߺ��ؼ� ����ϴ� ��� ����!!
		int i=10, j=10;
		int x=++i;  //i=i+1
					//int x=i
		int y=j--;	
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
		System.out.println(y);
//////////////////////////////////////////////////////////
		
		System.out.println("--------------------------");
		
		//���׿�����
		//->����)  (����) ? �� : ����
		
		
		int n=3;
		System.out.println(n*-1); //����
		System.out.println(-n);	  //����
		
		
		String str=(5<3) ? "�´�" : "Ʋ����";
				 // false
		System.out.println(str);
		
		
		//��1) ���밪(������ ���)�� ���Ͻÿ�
		int m=-5;
		int result=(m<0) ? -m   :   m;
				 //-5<0    -1*-5
		
		System.out.println(m+" ���밪: "+result);
		
		
		//��2) ������ �� �߿��� ���� ū ���� ���Ͻÿ�
		int p=3, q=9, r=7;
		
		int max=(p<q) ? q : p;
			  // 3<9    9
		max=(max<r) ? r : max;
		   // 9 <7         9
		
		System.out.println(p + "," + q + "," + r + "�� �ִ밪:" + max);
/////////////////////////////////////////////////////////////////////
		
		System.out.println("---------------------");
		
		//Math ���� ���� Ŭ����
		
		//���밪
		System.out.println(Math.abs(-3)); //-3
		
		//ū��
		System.out.println(Math.max(5, 7)); //7
		System.out.println(Math.max(2, Math.max(4, 6)));//6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end

}//class end
