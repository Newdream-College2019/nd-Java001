import java.util.Scanner;
public class Test01 
{
	public static void main(String[] args) 
	{
		double a;
		double b;
		double t;
		Scanner input = new Scanner(System.in);
		a=input.nextDouble();
		b=input.nextDouble(); 
		System.out.println("交换前："+a+","+b);
		t=a;
		a=b;
		b=t;
		System.out.println("交换后："+a+","+b);
	}
}
