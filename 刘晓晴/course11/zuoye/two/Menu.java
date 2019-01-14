package course11;

import java.util.*;
public class Menu {
	/**
	 * @author 小晴
	 * @version 1.0版*/
	int num;
	String name="newdream";
	String password="0000";
	Scanner input=new Scanner(System.in);
	/**显示首页*/
	public void show(){
		System.out.println("\n欢迎使用我行我素购物管理系统\n");
		System.out.println("\t1.登录系统");
		System.out.println("\t2.退出\n");
		System.out.println("********************************");
		System.out.print("请选择，输入数字：");
		num=input.nextInt();
		if(num==1){
			showLoginMenu();
		}else if(num==2){
			System.exit(0);
		}else{
			System.out.println("输入错误");
		}
	}
	/**显示登陆页面*/
	public void showLoginMenu(){
		System.out.print("请输入用户名：");
		String name1=input.next();
		System.out.print("请输入密码：");
		String password1=input.next();
		if(name.equals(name1)&&password.equals(password1)){
			showMainMenu();
		}else{
			System.out.println("@@您没有权限进入系统，请重新登录。@@");
		}
	}
	/**显示主页面*/
	public void showMainMenu(){
		System.out.println("\n我行我素购物管理系统主菜单");
		System.out.println("********************************\n");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.真情回馈");
		System.out.println("\n********************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		num=input.nextInt();
		if(num==1){
			showCustMenu();
		}else if(num==2){
			SendGMenu();
		}else if(num==0){
			show();
		}else{
			System.out.println("输入错误");
		}
	}
	/**显示客户信息管理页面*/
	public void showCustMenu(){
		System.out.println("\n我行我素购物管理系统》客户信息管理");
		System.out.println("********************************\n");
		System.out.println("\t1.查看用户用户信息");
		System.out.println("\t2.添加用户信息");
		System.out.println("\t3.退出");
		System.out.println("\n********************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		num=input.nextInt();
		if(num==1){
			System.out.println("执行查看用户信息");
		}else if(num==2){
			System.out.println("执行添加用户信息");
		}else if(num==3){
			System.exit(0);
		}else if(num==0){
			showMainMenu();
		}else{
			System.out.println("输入错误");
		}
	}
	/**显示真情回馈页面*/
	public void SendGMenu(){
		System.out.println("\n我行我素购物管理系统》真情回馈");
		System.out.println("********************************\n");
		System.out.println("\t1.幸运大放送");
		System.out.println("\t2.幸运抽奖");
		System.out.println("\t3.生日问候");
		System.out.println("\n********************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		num=input.nextInt();
		if(num==1){
			System.out.println("执行幸运大放送");
		}else if(num==2){
			System.out.println("执行幸运抽奖");
		}else if(num==3){
			System.out.println("执行生日问候");
		}else if(num==0){
			showMainMenu();
		}else{
			System.out.println("输入错误");
		}
	}
}
