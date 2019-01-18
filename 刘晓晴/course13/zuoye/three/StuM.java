package course13.zuoye;

import java.util.*;
public class StuM {
	String[] name=new String[5];
	int index;
	String stu2;
	
	Scanner input=new Scanner(System.in);
	public void addStu(){
		for(int i=0;i<name.length;i++){
			System.out.print("请输入客户的姓名：");
			String stu=input.next();
			name[i]=stu;
		}
		System.out.println("*******************************");
	}
	
	public void updateStu(){
		System.out.print("\n请输入要修改的客户姓名：");
		String stu=input.next();
		for(int i=0;i<name.length;i++){
			if(name[i].equals(stu)){
				System.out.print("请输入新的客户姓名：");
				stu2=input.next();
				name[i]=stu2;
				index=i;
			}
		}
	}
	public void find(){
		System.out.println("\n*******修改结果*******");
		if(name[index].equals(stu2)){
			System.out.println("找到并修改成功！");
			System.out.println("*******************************");
		}else{
			System.out.println("修改失败");
		}
	}
	
	public void show(){
		System.out.println("\t\t客户姓名列表：");
		System.out.println("*******************************");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+"\t");
		}
	}
}
