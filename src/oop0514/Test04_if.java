package oop0514;

public class Test04_if {

	public static void main(String[] args) {
		//���
		//->���α׷��� �帧�� ����
		//->���ǹ� : if, switch~case
		//->�ݺ��� : for, while, do~wile
		//->break��
		//->continue��
		
/*
	if(����) {������ true�϶��� ����}
	
	if(����) {������ true�϶��� ����}
	else {������ false�϶��� ����}

	if(����1) {����1�� true�϶��� ����}
	else if(����2) {����2�� true�϶��� ����}
	else if(����3) {����3�� true�϶��� ����}
	else  {���� ���ǵ��� false�϶� ������ ����}
*/
///////////////////////////////////////////////////////		
		
		//���� ���α׷�
		String name="����ȭ";
		int kor=100, eng=100, mat=35; //mat=35 -> aver=78.33
		
		//��� ���ϱ�
		double aver=(kor+eng+mat)/3.0;
		
		//����ϱ�
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("��� : " + aver);
		
		
		//��1)����� 95�� �̻��̸� ���л�
		if(aver>=95) { //if(78.33>=95)
			System.out.println("���л�");
		}//if end
		
		
		//��2)���������� 70�� �̻��̸� �հ�, �ƴϸ� ���հ�
		if(kor>=70) {
			System.out.println("����:�հ�");
		}else {
			System.out.println("����:���հ�");
		}//if end
		
			
		//��3)���������� 90�̻��� A����
		//            80���̻� B����
		//			  70���̻� C����
		//			  60���̻� D����
		//			  ������ F����

		if(mat>=90) {                      //if(75>=90)
			System.out.println("����:A����");
		}else if(mat>=80) {		           //else if(75>=80)
			System.out.println("����:B����");
		}else if(mat>=70) {			       //else if(75>=70) {����:C����}
			System.out.println("����:C����");
		}else if(mat>=60) {
			System.out.println("����:D����");
		}else {
			System.out.println("����:F����");
		}//if end
		
		
		//��4)����
		//->����� 70���̻��̸� �հ�(��, �������߿��� �Ѱ����̶� 40���̸��̸� �����)
		//->����� 70���̸��̸� ���հ�
		
		//1)OR����
		if(aver>=70) {
			
			if(kor<40 || eng<40 || mat<40) {//if(100<40 || 100<40 || 35<40)
											//if(false  || false  || true)
											//if(true)
				System.out.println("���:�����");
			}else {
				System.out.println("���:�հ�");
			}//if end
		
		}else {
			System.out.println("���:���հ�");
		}//if end
		
		
		//2)AND����
		if(aver>=70) {
			
			if(kor>=40 && eng>=40 && mat>=40) {
				System.out.println("���:�հ�");
			}else {
				System.out.println("���:���հ�");
			}//if end
		
		}else {
			System.out.println("���:���հ�");
		}//if end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end

}//class end
