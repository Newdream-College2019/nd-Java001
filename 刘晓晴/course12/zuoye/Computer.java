package course12;

import java.util.*;
public class Computer {
	String name;
	int score;
	public int getChioce(){
		Random r=new Random();
		int num=r.nextInt(3)+1;
		if(num==1){
			System.out.println(name+"��ȭ������");
		}else if(num==2){
			System.out.println(name+"��ȭ��ʯͷ");
		}else{
			System.out.println(name+"��ȭ����");
		}
		return num;
	}
	
}
