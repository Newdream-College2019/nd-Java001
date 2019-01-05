import java.util.Scanner;
public class Test05
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int day=n/24;
		int h=n-day*24;
		System.out.println(n+"个小时等于"+day+"天零"+h+"个小时");
	}
}
