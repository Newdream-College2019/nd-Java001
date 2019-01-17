package chapter10;

import java.util.Scanner;

public class Admin {
	String username;
	String password;
	public void show(){
		System.out.println("姓名："+username+",密码："+password);
	}
	public void rePassword(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n请输入新密码：");
		password=input.next();
		System.out.println("修改密码成功，您的新密码为："+password);
	}
}
