import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\n\t\t\t1.登录系统");
		System.out.println("\n\t\t\t2.退出");
		System.out.println("*****************************************************\n");
		System.out.print("请选择，输入数字：");
		int num=input.nextInt();
		switch(num){
			case 1:
				System.out.println("\n\t\t主菜单");
				System.out.println("\n\t\t1.客户信息管理");
				System.out.println("\n\t\t2.购物结算");
				System.out.println("\n\t\t3.真情回馈");
				System.out.println("\n\t\t4.注销");
				break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default:
				System.out.println("输入错误");
		}
	}
}
