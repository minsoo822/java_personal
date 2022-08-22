package oop0618;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;


class Mountain{
	String name; //산이름
	int height;  //산높이
	public Mountain() {} //default constructor 기본생성자함수
	public Mountain(String name, int height) {
		this.name=name;     //this.멤버변수=지역변수
		this.height=height;
	}//end
}//class end



public class Test05_generic {

	public static void main(String[] args) {
		//제네릭 Generic
		/*
		   <E>     Element
		   <K, V>  Key, Value
		   <T>
		   <?>
		   제네릭에는 참조형(클래스)만 가능하다
		*/
		
		int[] a=new int[3];
		//a[0]=2.4 에러. int형만 대입가능하다
		
		Vector<String> vec=new Vector<>();
		vec.add("서울");
		vec.add("제주");
		vec.add("부산");
		//vec.add(3); 에러

		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		//list.add(""); 에러
		
		
		HashMap<String, Double> map=new HashMap<>();
		map.put("one", 1.2);
		map.put("two", 3.4);
		//map.put("three", 5); 에러
		
//////////////////////////////////////////////////////		
		
		Mountain m1=new Mountain("한라산", 1950);
		Mountain m2=new Mountain("북한산", 1200);
		Mountain m3=new Mountain("설악산", 1300);
		
		ArrayList<Mountain> items=new ArrayList<>();
		items.add(m1);
		items.add(m2);
		items.add(m3);
		//items.add(""); 에러

		for(int i=0; i<items.size(); i++) {
			Mountain item=items.get(i);
			System.out.println(item.name);
			System.out.println(item.height);
		}//for end	
		
		
		

	}//main() end
}//class end
