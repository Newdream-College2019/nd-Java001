import java.util.Scanner;
public class Test10{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("欢迎使用MyShooping管理系统\n");
		System.out.println("***************************************");
		System.out.println("1.客户信息管理");
		System.out.println("2.购物结算");
		System.out.println("3.真情回馈");
		System.out.println("4.注销");
		System.out.println("***************************************\n");
		boolean b=true;
		System.out.print("请选择，输入数字：");
		do{
			
			int n = in.nextInt();
			switch(n){
				case 1:
					System.out.println("执行客户信息管理");
					b=false;break;
				case 2:
					System.out.println("执行购物结算");
					b=false;break;
				case 3:
					System.out.println("执行真情回馈");
					b=false;break;
				case 4:
					System.out.println("用户注销");
					b=false;break;
				default:
					System.out.println("输入错误，请重新输入：");
			}
		}while(b);
	}
}
