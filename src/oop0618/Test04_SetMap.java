package oop0618;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test04_SetMap {

	public static void main(String[] args) {
		//Set �迭 -> ������ ����
		
		HashSet set=new HashSet();
		
		set.add(5);
		set.add(6.7);
		set.add('D');
		set.add("APPLE");

		System.out.println(set.size()); //����� ����
		
		//��� ��������
		//set�� ������ �ִ� ��ҵ鿡 �����ϱ� ���� cursor����
		Iterator iter=set.iterator();
		while(iter.hasNext()) { //���� cursor�� �ִ���?
			//cursor�� ����Ű�� ��� ��������
			System.out.println(iter.next());			
		}//while end
		
///////////////////////////////////////////////////////
		
		//Map���� -> ������ ����
		//-> Key�� Value ���� (JSON, NoSQL �ַ� ���Ǵ� ����)
		//-> Key �̸�ǥ, Value ��
		
		HashMap map=new HashMap();
		map.put("name", "�����");
		map.put("age", 25);
		map.put("height", 180);

		System.out.println(map.size());
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("height"));		
		

	}//main() end
}//class end
