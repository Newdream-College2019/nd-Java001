import java.util.*;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个小数：");
		double a=input.nextDouble();
		System.out.println("请输入一个小数：");
		double b=input.nextDouble();
		double c;
		c=b;
		b=a;
		a=c;
		System.out.println(a+"\t"+b);

	}
}