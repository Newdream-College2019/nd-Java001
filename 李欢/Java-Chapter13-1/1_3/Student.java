package chapter13_1;

import java.util.Scanner;

public class Student {
	String[] name=new String[5];
	int i;
	String stu;
	public void show(){
		Scanner input=new Scanner(System.in);
		for(i=0;i<name.length;i++){
		System.out.print("请输入客户姓名：");
		name[i]=input.next();
		}
		System.out.println("***************************************");
		System.out.println("\t\t客户姓名列表：");
		System.out.println("***************************************");
		for(i=0;i<name.length;i++){
		System.out.print(name[i]+"\t");
		}
	}
	public void findByName(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n\n请输入要修改的客户姓名：");
		String oldName=input.next();
		for(i=0;i<name.length;i++){
			if(name[i].equals(oldName)){
				System.out.print("请输入新的客户姓名：");
				stu=input.next();
				name[i]=stu;
			}
		}
		System.out.println("\n******修改成功*****");
		System.out.println("找到并修改成功");
		
	}
	public void showInfo(){
		System.out.println("***************************************");
		System.out.println("\t\t客户姓名列表：");
		System.out.println("***************************************");
		for(i=0;i<name.length;i++){
		System.out.print(name[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.show();
		stu.findByName();
		stu.showInfo();
		

	}
}
