package oop0618;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;


class Mountain{
	String name; //���̸�
	int height;  //�����
	public Mountain() {} //default constructor �⺻�������Լ�
	public Mountain(String name, int height) {
		this.name=name;     //this.�������=��������
		this.height=height;
	}//end
}//class end



public class Test05_generic {

	public static void main(String[] args) {
		//���׸� Generic
		/*
		   <E>     Element
		   <K, V>  Key, Value
		   <T>
		   <?>
		   ���׸����� ������(Ŭ����)�� �����ϴ�
		*/
		
		int[] a=new int[3];
		//a[0]=2.4 ����. int���� ���԰����ϴ�
		
		Vector<String> vec=new Vector<>();
		vec.add("����");
		vec.add("����");
		vec.add("�λ�");
		//vec.add(3); ����

		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		//list.add(""); ����
		
		
		HashMap<String, Double> map=new HashMap<>();
		map.put("one", 1.2);
		map.put("two", 3.4);
		//map.put("three", 5); ����
		
//////////////////////////////////////////////////////		
		
		Mountain m1=new Mountain("�Ѷ��", 1950);
		Mountain m2=new Mountain("���ѻ�", 1200);
		Mountain m3=new Mountain("���ǻ�", 1300);
		
		ArrayList<Mountain> items=new ArrayList<>();
		items.add(m1);
		items.add(m2);
		items.add(m3);
		//items.add(""); ����

		for(int i=0; i<items.size(); i++) {
			Mountain item=items.get(i);
			System.out.println(item.name);
			System.out.println(item.height);
		}//for end	
		
		
		

	}//main() end
}//class end
