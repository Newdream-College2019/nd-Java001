package chapter12;

import java.util.Scanner;

public class Person {
	String name;
	String score;
	public int showFirst(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n请出拳：1.剪刀，2.石头，3.布（输入相应数字）:");
		int a=input.nextInt();
		if(a==1){
			System.out.println("你出拳：剪刀");
		}else if(a==2){
			System.out.println("你出拳：石头");
		}else if(a==3){
			System.out.println("你出拳：布");
		}else{
			System.out.println("输入有误！！！");
		}
		return a;
	}
}
