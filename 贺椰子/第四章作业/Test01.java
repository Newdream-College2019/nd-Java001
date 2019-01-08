import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出\n");
		System.out.println("**************************************************");
		System.out.print("请选择，输入数字：");
		int n = in.nextInt();
		switch(n){
			case 1:
				System.out.println("登录成功！");
				break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default:
				System.out.println("输入错误");
		}
	}
}
