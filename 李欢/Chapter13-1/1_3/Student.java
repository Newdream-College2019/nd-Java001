package chapter13_1;

import java.util.Scanner;

public class Student {
	String[] name=new String[5];
	int i;
	String stu;
	public void show(){
		Scanner input=new Scanner(System.in);
		for(i=0;i<name.length;i++){
		System.out.print("������ͻ�������");
		name[i]=input.next();
		}
		System.out.println("***************************************");
		System.out.println("\t\t�ͻ������б�");
		System.out.println("***************************************");
		for(i=0;i<name.length;i++){
		System.out.print(name[i]+"\t");
		}
	}
	public void findByName(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n\n������Ҫ�޸ĵĿͻ�������");
		String oldName=input.next();
		for(i=0;i<name.length;i++){
			if(name[i].equals(oldName)){
				System.out.print("�������µĿͻ�������");
				stu=input.next();
				name[i]=stu;
			}
		}
		System.out.println("\n******�޸ĳɹ�*****");
		System.out.println("�ҵ����޸ĳɹ�");
		
	}
	public void showInfo(){
		System.out.println("***************************************");
		System.out.println("\t\t�ͻ������б�");
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
