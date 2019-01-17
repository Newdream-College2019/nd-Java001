package course12;

import java.util.*;
public class Computer {
	String name;
	int score;
	public int getChioce(){
		Random r=new Random();
		int num=r.nextInt(3)+1;
		if(num==1){
			System.out.println(name+"出拳：剪刀");
		}else if(num==2){
			System.out.println(name+"出拳：石头");
		}else{
			System.out.println(name+"出拳：布");
		}
		return num;
	}
	
}
