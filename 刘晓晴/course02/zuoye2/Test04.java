import java.util.*;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a+"\t"+b);
	}
}
