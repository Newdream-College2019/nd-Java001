import java.util.Scanner;
public class Test19{
	public static void main(String[] agrs){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一位整数：");
		int a=input.nextInt();
		if(a%2==0){
			System.out.println("这个数是偶数");
		}
		else if(a%2==1){
			System.out.println("这个数是奇数");
		}
	}
}