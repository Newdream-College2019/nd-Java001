import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入三个整数:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int sum=a+b+c;
		if(a==b&&b==c&&a==c){
			System.out.println("这三个数相等");
			if(sum>1000){
				System.out.println("这三个数之和大于 100");
			}
			else{
				System.out.println("这三个数之和不大于 1000");
			}
		}
	}

}