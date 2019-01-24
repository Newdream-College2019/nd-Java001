package chapter19;

import java.util.*;

public class Queue {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(new Penguin("欧欧","Q仔"));
		list.add(new Penguin("亚亚","Q妹"));
		list.add(new Penguin("菲菲","Q妹"));
		list.add(new Penguin("美美","Q妹"));
		Penguin first=(Penguin) list.getFirst();
		System.out.println("第一只企鹅的昵称是："+first.getName());
		Penguin last=(Penguin) list.getLast();
		System.out.println("第一只企鹅的昵称是："+last.getName());
		list.removeFirst();
		System.out.println("共计有"+list.size()+"企鹅");
		System.out.println("分别是：");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
