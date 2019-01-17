package chapter11;

import java.util.Scanner;

public class StartSMS {
	public static void main(String[] args) {
		System.out.println("********************************************\n");
		System.out.println("\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t\t1.登录系统");
		System.out.println("********************************************");
		System.out.print("请选择，输入数字：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num==1){
			System.out.print("请输入用户名：");
			String name=input.next();
			System.out.print("请输入密码：");
			String password=input.next();
			if(name.equals("admin")&&password.equals("123456")){
				System.out.println("登陆成功！");
			}else{
				System.out.println("@@您没有权限进入系统，请重新登录@@");
			}
		}
	}
}
