import java.util.Scanner;
public class Test01{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1.登录系统");
		System.out.println("2.退出");
		System.out.println("*********************************");
		System.out.print("请输入数字：");
		int one=input.nextInt();
		switch(one){
			case 1:{
				System.out.println("主菜单（第二级）：");
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				System.out.println("*********************************");
				System.out.print("请输入数字：");
				int two=input.nextInt();
				switch (two){
					case 1:{
						System.out.println("购物管理系统》客户信息管理");
						System.out.println("1.显示所有客户信息");
						System.out.println("2.添加客户信息");
						System.out.println("3.修改客户信息");
						System.out.println("4.查询客户信息");
					}
						break;
					case 2:
						System.out.println("购物管理系统》购物结算");
					case 3:{
						System.out.println("购物管理系统》真情回馈");
						System.out.println("1.幸运大放送");
						System.out.println("2.幸运抽奖");
						System.out.println("3.生日问候");
					}
						break;
					case 4:
						System.out.println("谢谢您的使用！");
						break;
					default:
						System.out.println("输入错误！");
						break;
				}
			}
				break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default :
				System.out.println("输入错误！");
				break;

		}
	}
}
