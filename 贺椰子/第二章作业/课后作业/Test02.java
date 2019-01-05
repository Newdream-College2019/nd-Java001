import java.util.Scanner;
public class Test02 
{
	public static void main(String[] args) 
	{
		int a; 
		Scanner input = new Scanner(System.in);
		System.out.print("请输入边长：");
		a=input.nextInt();
		int zc=a*4;
		int mj=a*a;
		System.out.println("周长："+zc+",面积："+mj);
	}
}
