import java.util.Scanner;
public class Test04
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("输入一个四位的整数：");
		int n=in.nextInt();
		int ge=n%10;
		int shi=n/10%10;
		int bai=n/100%10;
		int qian=n/1000;
		System.out.println("个位："+ge+",十位："+shi+",百位："+bai+",千位："+qian);
	}
}
