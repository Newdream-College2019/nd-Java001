package chapter19;


import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Penguin("欧欧","Q仔"));
		list.add(new Penguin("亚亚","Q妹"));
		list.add(new Penguin("菲菲","Q妹"));
		list.add(new Penguin("美美","Q妹"));
		System.out.println("共计有"+list.size()+"企鹅");
		System.out.println("分别是：");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.remove(new Penguin("菲菲","Q妹"));
		list.remove(new Penguin("美美","Q妹"));
		System.out.println("\n删除之后还有"+list.size()+"只企鹅。");
		System.out.println("分别是：");
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		for(Object obj:list){
			System.out.println(obj);
		}
		boolean flag=list.contains(new Penguin("美美","Q妹"));
		if(flag==true){
			System.out.println("\n集合中包含美美的信息");
		}else{
			System.out.println("\n集合中不包含美美的信息");
		}
		
	}
}
