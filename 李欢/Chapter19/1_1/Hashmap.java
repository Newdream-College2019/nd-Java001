package chapter19;

import java.util.*;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("欧欧", "雪娜瑞");
		System.out.println("Map中存在指定对象，对象信息如下：");
		Set set=map.keySet();
		for(Object key:set){
			System.out.println(key+"\t"+map.get(key));
		}
		
	}
}
