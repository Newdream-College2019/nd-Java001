import java.util.*;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��С����");
		double a=input.nextDouble();
		System.out.println("������һ��С����");
		double b=input.nextDouble();
		double c;
		c=b;
		b=a;
		a=c;
		System.out.println(a+"\t"+b);

	}
}