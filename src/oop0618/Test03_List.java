package oop0618;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test03_List {

	public static void main(String[] args) {
		//Java Collection Framework
		/*
			- �����͸� �Ѳ����� ��Ƽ� ������ �� �ִ� Ŭ���� �� �������̽�
		    - �迭 Array
		    - ��� Element
		    
		    - List�迭 : ������ �ִ�. 0��°���� ����       Vector, ArrayList ~		                 
		    - Set�迭  : ������ ����.                   HashSet ~
		    - Map�迭  : ������ ����. Key�� Value�� ����  HashMap, Properties, HashTable ~~
		*/
		/*
            interface List{}
            interface Set{}
            interface Map{}
            
            class Vector implements List{}
            class ArrayList implements List{}
            class HashSet implements Set{}
            class HashMap implements Map{}
            
            List list=new Vector() ������
            Set set=new HashSet()
            Map map=new HashMap()
		*/
///////////////////////////////////////////////////////////////////////////////
		
		Vector vec=new Vector();
		vec.add(3);
		vec.add(2.4);
		vec.add('R');
		vec.add("KOREA");

		System.out.println(vec.size()); //����� ����
		
		//��� ��������
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}//for end
		
		/*
		//0��° ��� ����
		vec.remove(0);
		System.out.println(vec.size());
		
		//��� ���� ����
		vec.removeAllElements();
		if(vec.isEmpty()) {
			System.out.println("����ִ�");
		}else {
			System.out.println("������� �ʴ�");
		}//if end
		*/
		
		
		//��)remove()�Լ��� �̿��ؼ� vec ��� ���� �����Ͻÿ�
		for(int i=vec.size()-1; i>=0; i--) {
			vec.remove(i);
		}//for end
		
		System.out.println(vec.size());
		
//////////////////////////////////////////////////////
		
		
		//������
		List list=new ArrayList();
		
		list.add(5);
		list.add(6.7);
		list.add('B');
		list.add("SEOUL");

		System.out.println(list.size());
		
		
		
	}//main() end
}//class end
