import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int a=number%10;
		int b=number/10;
		System.out.println(a+"\t"+b);
	}
}