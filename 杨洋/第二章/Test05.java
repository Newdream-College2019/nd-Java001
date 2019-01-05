import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int a=number/1000%10;
		int b=number/100%10;
		int c=number/10%10;
		int d=number%10;
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}
}