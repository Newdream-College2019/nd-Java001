import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int a=number%10;
		int b=number/10%10;
		int c=number/100;
		int d=a;
		a=c;
		c=d;
		System.out.println(c+"\t"+b+"\t"+a);
	}
}