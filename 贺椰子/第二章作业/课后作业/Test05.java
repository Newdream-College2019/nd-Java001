import java.util.Scanner;
public class Test05
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int day=n/24;
		int h=n-day*24;
		System.out.println(n+"��Сʱ����"+day+"����"+h+"��Сʱ");
	}
}
