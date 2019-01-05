import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int a=num/100;
		int b=num/10%10;
		int c=num%10;
		int d;
		d=a;
		a=c;
		c=d;
		System.out.println(a+""+b+""+c);
	}
}