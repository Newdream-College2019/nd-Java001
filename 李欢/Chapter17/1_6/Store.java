package chapter17;

import java.util.Scanner;

public class Store {
	public static void get(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入宠物类型：");
		String type=input.next();
		if(type.equals("狗狗")){
			Dog dog=new Dog();
			dog.shout();
		}else {
			Cat cat=new Cat();
			cat.shout();
		}
	}
}
