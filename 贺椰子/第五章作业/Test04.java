import java.util.Scanner;
public class Test04{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("输入星期几");
		int n=in.nextInt();
		switch(n){
			case 1:
				System.out.println("星期一");break;
			case 2:
				System.out.println("星期二");break;
			case 3:
				System.out.println("星期三");break;
			case 4:
				System.out.println("星期四");break;
			case 5:
				System.out.println("星期五");break;
			case 6:
				System.out.println("星期六");break;
			case 7:
				System.out.println("星期日);break;
			default:
				System.out.println("输入错误！");
		} 
	}
}
