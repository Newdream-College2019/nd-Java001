package chapter12;

import java.util.Random;
public class Computer {
	String name;
	int score;
	public int getChoice(){
		Random rd=new Random();
		int num=rd.nextInt(3)+1;
		if(num==1){
			System.out.println(name+"出拳：剪刀");
		}else if(num==2){
			System.out.println(name+"出拳：石头");
		}else if(num==3){
			System.out.println(name+"出拳：布");
		}else{
			System.out.println("输入有误！！");
		}
		return num;
	}
}
