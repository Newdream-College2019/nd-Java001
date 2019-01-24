import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎是由MyShopping管理系统\n");
		System.out.println("**************************************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.购物结算");
		System.out.println("\t\t3.真情回馈");
		System.out.println("\t\t4.注销");
		System.out.println("**************************************\n");
		boolean bl=true;
		System.out.print("请选择，输入数字：");
		do{
			int num=input.nextInt();
			switch(num){
				case 1:
					System.out.println("执行客户信息管理\n\n");
					bl=false;
					break;
				case 2:
					System.out.println("执行购物结算\n\n");
					bl=false;
					break;
				case 3:
					System.out.println("执行真情回馈\n\n");
					bl=false;
					break;
				case 4:
					System.out.println("执行注销\n\n");
					bl=false;
					break;
				default:
					System.out.print("输入错误，请重新输入数字：");
			}
		}while(bl);
			System.out.println("程序结束");
		
	}
}