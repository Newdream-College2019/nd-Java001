package chapter19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMap {
	private int id;
	public static void main(String[] args) {	
		HashMap map=new HashMap();
		map.put("亚亚","Q妹");
		map.put("菲菲","Q妹");
		map.put("欧欧","Q仔");
		map.put("美美","Q妹");
		System.out.println("使用Iterator遍历，所有企鹅的昵称和品种分钟是：");
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			String key=(String) it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("使用foreach遍历，所有企鹅的昵称和品种分钟是：");
		Set set1=map.keySet();
		for(Object key:set1){
			System.out.println(key+"\t"+map.get(key));
		}

	}
}
