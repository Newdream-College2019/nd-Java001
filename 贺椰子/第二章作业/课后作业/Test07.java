import java.util.Scanner;
public class Test07 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("��������������");
		int a=in.nextInt();
		int b=in.nextInt();
		int t;
		System.out.println("����ǰ��a="+a+",b="+b);
		t=a;
		a=b;
		b=t;
		System.out.println("������a="+a+",b="+b);
	}
}
