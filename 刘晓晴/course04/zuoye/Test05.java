import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三个数:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int sum=a+b+c;
		if(a==b&&b==c){
			System.out.println("这三个数相等");
		}else{
			if(sum>1000){
				System.out.println("这三个数之和大于1000");
			}else{
				System.out.println("这三个数之和不大于1000");
			}
		
		}
	}
}