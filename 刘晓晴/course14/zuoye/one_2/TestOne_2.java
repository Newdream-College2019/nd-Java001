package course14;

import java.util.*;
public class TestOne_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		String type;
		String strain = null;
		String sex = null;
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请输入要领养宠物的名字：");
		name=input.next();
		System.out.print("请选择要领养的宠物类型：(1、狗狗 2、企鹅)");
		int n=input.nextInt();
		if(n==1){
			type="狗狗";
			System.out.print("请选择狗狗的品种：(1、聪明的拉布拉多犬 2、酷酷的雪纳瑞)");
			int p=input.nextInt();
			if(p==1){
				strain="聪明的拉布拉多犬";
			}else if(p==2){
				strain="酷酷的雪纳瑞";
			}
			Dog dog=new Dog();
			dog.setName(name);
			dog.setStrain(strain);
			System.out.println("宠物自白：");
			System.out.println("我的名字叫"+dog.getName()+",健康值是"+dog.getHealth()+",和主人的亲密度是"+dog.getLove()+",我是一只聪明的"+dog.getStrain());
		}else{
			type="企鹅";
			System.out.print("请选择企鹅的性别：(1、Q仔 2、Q妹)");
			int p=input.nextInt();
			if(p==1){
				sex="Q仔";
			}else if(p==2){
				sex="Q妹";
			}
			Penguin penguin=new Penguin();
			penguin.setName(name);
			penguin.setSex(sex);
			System.out.println("宠物自白：");
			System.out.println("我的名字叫"+penguin.getName()+",健康值是"+penguin.getHealth()+",和主人的亲密度是"+penguin.getLove()+",我是聪明的"+penguin.getSex());
		} 
	
		
	}
}
