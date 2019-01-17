package course12;

import java.util.Scanner;

public class Player {
	String name;
	int score;
	public int getChoice(){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num==1){
			System.out.println("你出拳：剪刀");
		}else if(num==2){
			System.out.println("你出拳：石头");
		}else if(num==3){
			System.out.println("你出拳：布");
		}else{
			System.out.println("输入错误");
		}
		return num;
	}
}
