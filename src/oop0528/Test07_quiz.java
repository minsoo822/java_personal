package oop0528;

public class Test07_quiz {

	public static void main(String[] args) {
		//����) 
		//�Ʒ� pathName���� ���ϸ�� Ȯ����� �и��ϰ� 
		//Ȯ����� �̹��� ����(,png ,jpg ,gif)���� Ȯ���Ͻÿ�   (����)
		//��°��
		//-> ���ϸ� : sky2022.05.28
		//-> Ȯ��� : png
		
		String pathName="c:/myphoto/sky2022.05.28.png";
		
		int lastSlash=pathName.lastIndexOf("/");//������ / ������ ��ġ
		int lastDot	 =pathName.lastIndexOf(".");//������ . ������ ��ġ
		System.out.println(lastSlash); //10
		System.out.println(lastDot);   //24
		
		//String file=pathName.substring(11, 24);
		String file=pathName.substring(lastSlash+1, lastDot);
		System.out.println(file);
		
		//String ext=pathName.substring(25);
		String ext=pathName.substring(lastDot+1);
		System.out.println(ext);
		
		
	}//main() end
}//class end
