package chapter19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMap {
	private int id;
	public static void main(String[] args) {	
		HashMap map=new HashMap();
		map.put("����","Q��");
		map.put("�Ʒ�","Q��");
		map.put("ŷŷ","Q��");
		map.put("����","Q��");
		System.out.println("ʹ��Iterator���������������ǳƺ�Ʒ�ַ����ǣ�");
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			String key=(String) it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("ʹ��foreach���������������ǳƺ�Ʒ�ַ����ǣ�");
		Set set1=map.keySet();
		for(Object key:set1){
			System.out.println(key+"\t"+map.get(key));
		}

	}
}
