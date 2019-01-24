package chapter15;

import java.util.Scanner;


public class TestPet {
	public static void main(String[] args) {
		String name = null;
		String strain = null;
		int num;
		String sex = null;
		System.out.println("欢迎您来到宠物店！");
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要领养宠物的名字：");
		name=input.next();  
		System.out.print("请选择要领养的宠物类型：（1、狗狗2、企鹅）");
		int type=input.nextInt();
		if(type==1){
			System.out.print("请选择狗狗的品种：（1、聪明的拉布拉多犬2、酷酷的雪娜瑞）");
			num=input.nextInt();
			if(num==1){
				strain="聪明的拉布拉多犬";
			}else{
				strain="酷酷的雪娜瑞";
			}
			Dog dog=new Dog(name,strain);
			dog.print();
		}else if(type==2){
			System.out.print("请选择企鹅的性别：（1、Q仔2、Q妹）");
			int p=input.nextInt();
			if(p==1){
				sex="Q仔";
			}else if(p==2){
				sex="Q妹";				
			}
			Penguin penguin=new Penguin(name,sex);
			penguin.print();
		}else{
			System.out.println("输入有误！");
		}
		
	}

}
