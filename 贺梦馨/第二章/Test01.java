import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int c=number%10;
		int b=number/10%10;
		int a=number/100;
		int d;
		d=a;
		a=c;
		c=d;
		System.out.print(a+""+b+""+c);
}
}