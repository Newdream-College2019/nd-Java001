package chapter19;

import java.util.*;

public class TestStudent2 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("����", 86);
		map.put("����", 76);
		map.put("����", 59);
		map.put("����", 95);
		System.out.println("����\t\t����");
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			String key=(String) it.next();
			System.out.println(key+"\t\t"+map.get(key));
		}
		map.put("����", 45);
		System.out.println("\n�޸ĺ������");
		System.out.println("����\t\t����");
		Set set1=map.keySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext()){
			String key=(String) it1.next();
			System.out.println(key+"\t\t"+map.get(key));
		}
	}
}
