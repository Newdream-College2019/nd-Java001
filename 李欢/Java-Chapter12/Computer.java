package chapter12;

import java.util.Random;
public class Computer {
	String name;
	int score;
	public int getChoice(){
		Random rd=new Random();
		int num=rd.nextInt(3)+1;
		if(num==1){
			System.out.println(name+"��ȭ������");
		}else if(num==2){
			System.out.println(name+"��ȭ��ʯͷ");
		}else if(num==3){
			System.out.println(name+"��ȭ����");
		}else{
			System.out.println("�������󣡣�");
		}
		return num;
	}
}
