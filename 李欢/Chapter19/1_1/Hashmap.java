package chapter19;

import java.util.*;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("ŷŷ", "ѩ����");
		System.out.println("Map�д���ָ�����󣬶�����Ϣ���£�");
		Set set=map.keySet();
		for(Object key:set){
			System.out.println(key+"\t"+map.get(key));
		}
		
	}
}
