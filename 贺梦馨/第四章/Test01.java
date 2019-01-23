import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		System.out.println("******************************");
		System.out.println("  欢迎使用我行我素购物系统！");
		System.out.println("1.登录系统");
		System.out.println("");
		System.out.println("2.退出");
		System.out.println("******************************");
		System.out.println("请选择数字：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		switch(num){
			case 1:
			System.out.println("欢迎进入登录页面");
			break;
			case 2:
			System.out.println("感谢您的使用！");
			break;
			default:
			System.out.println("输入错误，请重新输入数字：");
			break;
		}
	}
}
