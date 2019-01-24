package chapter19;

import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("张三", 86);
		map.put("李四", 76);
		map.put("王五", 59);
		map.put("贺六", 95);
		System.out.println("姓名\t\t分数");
		Set set=map.keySet();
		for(Object key:set){
			System.out.println(key+"\t\t"+map.get(key));
		}
		
		map.put("贺六", 45);
		System.out.println("\n修改后分数：");
		System.out.println("姓名\t\t分数");
		Set set1=map.keySet();
		for(Object key:set1){
			System.out.println(key+"\t\t"+map.get(key));
		}
	}
}
