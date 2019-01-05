import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double number=input.nextDouble();
		int a=(int)number;
		double b=number-a;
		System.out.println(a+"\t"+b);
	}
}