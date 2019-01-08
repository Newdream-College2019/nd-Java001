import java.util.Scanner;
public class Test05{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("输入三个整数：");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a==b&&a==c&&b==c){
			System.out.println("这三个数相等");
			if(a+b+c>1000){
				System.out.println("这三个数之和大于1000");
			}else{
				System.out.println("这三个数之和不大于1000");
			}
		}
	}
}
