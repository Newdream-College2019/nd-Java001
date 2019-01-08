import java.util.Scanner;
public class two{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println();
		System.out.println("**************************************");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.购物结算");
		System.out.println("\t3.真情回馈");
		System.out.println("\t4.注销");
		System.out.println("**************************************");
		System.out.println();
		System.out.print("请选择，输入的数字：");
		int num=input.nextInt();
		String check="false";
		while(check.equals("false")){
			switch(num){
				case 1:{
					System.out.println("执行客户管理");
					check="true";
				}
					break;
				case 2:{
					System.out.println("执行购物结算");
					check="true";
				}
					break;
				case 3:{
					System.out.println("执行真情回馈");
					check="true";
				}
					break;
				case 4:{
					System.out.println("执行注销");
					check="true";
				}
					break;
				default :{
					System.out.print("输入错误，请重新输入数字：");
					num=input.nextInt();
					check="false";
				}
					break;
			}
		}
		System.out.println();
		System.out.println("程序结束");
	}
}