package chapter14;

import java.util.Scanner;

public class Pet2 {
	public static void main(String[] args) {
		String name = null;
		String strain = null;
		int num;
		String sex = null;
		System.out.println("欢迎您来到宠物店！");
		Scanner input=new Scanner(System.in);
		Dog dog=new Dog(name,strain);
		Penguin penguin=new Penguin();
		Pig pig=new Pig();
		System.out.print("请输入要领养宠物的名字：");
		name=input.next();  
		System.out.print("请选择要领养的宠物类型：（1、狗狗2、企鹅3、猪）");
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
			int num2=input.nextInt();
			if(num2==1){
				sex=Penguin.SEX_MALE;
				penguin.print(name, sex);
			}else if(num2==2){
				sex=Penguin.SEX_FEMALE;
				penguin.print(name, sex);
			}
		}else if(type==3){
			System.out.print("请选择猪的毛发颜色：（1、白2、黑）");
			String color=null;
			int num3=input.nextInt();
			if(num3==1){
				color="白";
				pig.print(name, color);
			}else if(num3==2){
				color="黑";
				pig.print(name, color);
			}else{
			System.out.println("输入有误！");
		}
		
	}
	}
}