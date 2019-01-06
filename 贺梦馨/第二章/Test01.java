import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		System.out.println("请输入一个三位整数");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int a=num%10;
		int b=num/10%10;
		int c=num/100;
		if(b>a&&c>b){
		System.out.println("输入的数是一个降序数");
		}else
		{System.out.println("输入的数不是一个降序数");}

}
}