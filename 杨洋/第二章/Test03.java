import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double number=input.nextDouble();
		double number2=input.nextDouble();
		double a=number%10;
		double b=number2%10;
		double c=a;
		a=b;
		b=c;
		System.out.println(a+"\t"+b);
	}
}