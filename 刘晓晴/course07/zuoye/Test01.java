import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个1~10的正整数：");
		int num=input.nextInt();
		int sum=1;
		if(num>=1&&num<=10){
			System.out.print(num+"!"+"=");
			for(int i=num;i>=1;i--){
				sum=sum*i;
				if(i<num){
					System.out.print("*");
				}
				System.out.print(i);
			}
			System.out.print("="+sum);
		}else{
			System.out.println("输入错误");
		}
	}
}