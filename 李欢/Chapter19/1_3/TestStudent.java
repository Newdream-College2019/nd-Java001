package chapter19;

import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("����", 86);
		map.put("����", 76);
		map.put("����", 59);
		map.put("����", 95);
		System.out.println("����\t\t����");
		Set set=map.keySet();
		for(Object key:set){
			System.out.println(key+"\t\t"+map.get(key));
		}
		
		map.put("����", 45);
		System.out.println("\n�޸ĺ������");
		System.out.println("����\t\t����");
		Set set1=map.keySet();
		for(Object key:set1){
			System.out.println(key+"\t\t"+map.get(key));
		}
	}
}
