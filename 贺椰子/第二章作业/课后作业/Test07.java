import java.util.Scanner;
public class Test07 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("输入两个整数：");
		int a=in.nextInt();
		int b=in.nextInt();
		int t;
		System.out.println("交换前：a="+a+",b="+b);
		t=a;
		a=b;
		b=t;
		System.out.println("交换后：a="+a+",b="+b);
	}
}
