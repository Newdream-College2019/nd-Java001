package chapter19;


import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Penguin("ŷŷ","Q��"));
		list.add(new Penguin("����","Q��"));
		list.add(new Penguin("�Ʒ�","Q��"));
		list.add(new Penguin("����","Q��"));
		System.out.println("������"+list.size()+"���");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.remove(new Penguin("�Ʒ�","Q��"));
		list.remove(new Penguin("����","Q��"));
		System.out.println("\nɾ��֮����"+list.size()+"ֻ��졣");
		System.out.println("�ֱ��ǣ�");
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		for(Object obj:list){
			System.out.println(obj);
		}
		boolean flag=list.contains(new Penguin("����","Q��"));
		if(flag==true){
			System.out.println("\n�����а�����������Ϣ");
		}else{
			System.out.println("\n�����в�������������Ϣ");
		}
		
	}
}
