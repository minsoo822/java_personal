package oop0618;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test03_List {

	public static void main(String[] args) {
		//Java Collection Framework
		/*
			- 데이터를 한꺼번에 모아서 저장할 수 있는 클래스 및 인터페이스
		    - 배열 Array
		    - 요소 Element
		    
		    - List계열 : 순서가 있다. 0번째부터 시작       Vector, ArrayList ~		                 
		    - Set계열  : 순서가 없다.                   HashSet ~
		    - Map계열  : 순서가 없다. Key와 Value로 구성  HashMap, Properties, HashTable ~~
		*/
		/*
            interface List{}
            interface Set{}
            interface Map{}
            
            class Vector implements List{}
            class ArrayList implements List{}
            class HashSet implements Set{}
            class HashMap implements Map{}
            
            List list=new Vector() 다형성
            Set set=new HashSet()
            Map map=new HashMap()
		*/
///////////////////////////////////////////////////////////////////////////////
		
		Vector vec=new Vector();
		vec.add(3);
		vec.add(2.4);
		vec.add('R');
		vec.add("KOREA");

		System.out.println(vec.size()); //요소의 갯수
		
		//요소 가져오기
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}//for end
		
		/*
		//0번째 요소 제거
		vec.remove(0);
		System.out.println(vec.size());
		
		//요소 전부 제거
		vec.removeAllElements();
		if(vec.isEmpty()) {
			System.out.println("비어있다");
		}else {
			System.out.println("비어있지 않다");
		}//if end
		*/
		
		
		//문)remove()함수를 이용해서 vec 요소 전부 삭제하시오
		for(int i=vec.size()-1; i>=0; i--) {
			vec.remove(i);
		}//for end
		
		System.out.println(vec.size());
		
//////////////////////////////////////////////////////
		
		
		//다형성
		List list=new ArrayList();
		
		list.add(5);
		list.add(6.7);
		list.add('B');
		list.add("SEOUL");

		System.out.println(list.size());
		
		
		
	}//main() end
}//class end
