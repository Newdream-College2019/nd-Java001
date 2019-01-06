import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		int j;
		int k;
		System.out.println("请输入三个整数：");
			i=input.nextInt();
			j=input.nextInt();
			k=input.nextInt();
		if(i==j&&j==k){
			System.out.println("这三个数相等");
		}else if((i+j+k)>1000){
			System.out.println("这三个数之和大于1000");
		}else
			System.out.println("这三个数之和不大于1000");}
}