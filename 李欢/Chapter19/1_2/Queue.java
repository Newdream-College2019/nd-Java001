package chapter19;

import java.util.*;

public class Queue {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(new Penguin("ŷŷ","Q��"));
		list.add(new Penguin("����","Q��"));
		list.add(new Penguin("�Ʒ�","Q��"));
		list.add(new Penguin("����","Q��"));
		Penguin first=(Penguin) list.getFirst();
		System.out.println("��һֻ�����ǳ��ǣ�"+first.getName());
		Penguin last=(Penguin) list.getLast();
		System.out.println("��һֻ�����ǳ��ǣ�"+last.getName());
		list.removeFirst();
		System.out.println("������"+list.size()+"���");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
