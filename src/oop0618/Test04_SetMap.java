package oop0618;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test04_SetMap {

	public static void main(String[] args) {
		//Set 계열 -> 순서가 없다
		
		HashSet set=new HashSet();
		
		set.add(5);
		set.add(6.7);
		set.add('D');
		set.add("APPLE");

		System.out.println(set.size()); //요소의 갯수
		
		//요소 가져오기
		//set이 가지고 있는 요소들에 접근하기 위해 cursor생성
		Iterator iter=set.iterator();
		while(iter.hasNext()) { //다음 cursor가 있는지?
			//cursor가 가리키는 요소 가져오기
			System.out.println(iter.next());			
		}//while end
		
///////////////////////////////////////////////////////
		
		//Map개열 -> 순서가 없다
		//-> Key와 Value 구성 (JSON, NoSQL 주로 사용되는 문법)
		//-> Key 이름표, Value 값
		
		HashMap map=new HashMap();
		map.put("name", "손흥민");
		map.put("age", 25);
		map.put("height", 180);

		System.out.println(map.size());
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("height"));		
		

	}//main() end
}//class end
