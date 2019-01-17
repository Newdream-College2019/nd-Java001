package chapter11;

import java.util.Scanner;

public class Menu {
	Scanner input=new Scanner(System.in);
	public void showLoginMenu(){
		System.out.println("*************************************************\n");
		System.out.println("\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t\t1.登录系统\n");
		System.out.println("\t\t\t2.退出\n");
		System.out.println("*************************************************");
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		if(a==1){
			showMainMenu();
		}else if(a==2){
			System.out.println("退出系统！！");
		}else {
			System.out.println("输入有误！！");
		}
	}
	public void showMainMenu(){
		System.out.println("\n*************************************************\n");
		System.out.println("\t\t我行我素购物管理系统主菜单\n");
		System.out.println("\t\t\t1.客户信息管理\n");
		System.out.println("\t\t\t2.真情回馈\n");
		System.out.println("*************************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int b=input.nextInt();
		if(b==1){
			showCustMenu();
		}else if(b==2){
			showSendMenu();
		}else if(b==0){
			showLoginMenu();
		}else{
			System.out.println("输入有误");
		}
	}
	public void showCustMenu(){
		System.out.println("\n*************************************************\n");
		System.out.println("\t\t我行我素购物管理系统>客户管理系统\n");
		System.out.println("\t\t\t1.查询客户信息\n");
		System.out.println("\t\t\t2.修改客户信息\n");
		System.out.println("\t\t\t3.添加客户信息\n");
		System.out.println("\t\t\t4.显示所有客户信息\n");
		System.out.println("*************************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int c=input.nextInt();
		if(c==1){
			System.out.println("执行查询客户信息");
		}else if(c==2){
			System.out.println("执行修改客户信息");
		}else if(c==3){
			System.out.println("执行添加客户信息");
		}else if(c==4){
			System.out.println("执行显示所有客户信息");
		}else if(c==0){
			showMainMenu();
		}else{
			System.out.println("输入有误！");
		}
		
	}
	public void showSendMenu(){
		System.out.println("\n*************************************************\n");
		System.out.println("\t\t我行我素购物管理系统>真情回馈\n");
		System.out.println("\t\t\t1.幸运大放送\n");
		System.out.println("\t\t\t2.幸运抽奖\n");
		System.out.println("\t\t\t3.生日问候\n");
		System.out.println("*************************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int aa=input.nextInt();
		if(aa==1){
			System.out.println("执行幸运大放送");
		}else if(aa==2){
			System.out.println("执行幸运抽奖");
		}else if(aa==3){
			System.out.println("执行生日问候");
		}else if(aa==0){
			showMainMenu();
		}else{
			System.out.println("输入有误！");
		}
	}
	
}
