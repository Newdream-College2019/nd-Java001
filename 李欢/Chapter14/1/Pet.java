package chapter14;

import java.util.Scanner;

public class Pet {
	public static void main(String[] args) {
		String name;
		String strain = null;
		int num;
		String sex = null;
		System.out.println("欢迎您来到宠物店！");
		Scanner input=new Scanner(System.in);
		Dog dog=new Dog();
		Penguin penguin=new Penguin();
		System.out.print("请输入要领养宠物的名字：");
		name=input.next();  
		System.out.print("请选择要领养的宠物类型：（1、狗狗2、企鹅）");
		int type=input.nextInt();
		if(type==1){
			System.out.print("请选择狗狗的品种：（1、聪明的拉布拉多犬2、酷酷的雪娜瑞）");
			num=input.nextInt();
			if(num==1){
				strain="聪明的拉布拉多犬";
				dog.print(name,strain);
			}else{
				strain="酷酷的雪娜瑞";
				dog.print(name,strain);
			}
		}else if(type==2){
			System.out.print("请选择企鹅的性别：（1、Q仔2、Q妹）");
			int p=input.nextInt();
			if(p==1){
				sex="Q仔";
				penguin.print(name, sex);
			}else if(p==2){
				sex="Q妹";
				penguin.print(name, sex);
			}
			
		}else{
			System.out.println("输入有误！");
		}
		
	}

}
