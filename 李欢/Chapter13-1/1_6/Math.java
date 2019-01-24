package chapter13_1;

import java.util.Scanner;

public class Math {
	public int max(int a1,int a2){
		if(a1>a2){
			return a1;
		}else{
			return a2;
		}
	}
	public int gewei(int b){
		int bb=b%10;
		return bb;
	}
	public int lifang(int c){
		int cc=c*c*c;
		return cc;
	}
	public int add(int d){
		int sum=0;
		for(int i=d;i>=1;i--){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Math math=new Math();
		System.out.print("请输入第一个整数：");
		int a1=input.nextInt();
		System.out.print("请输入第二个整数：");
		int a2=input.nextInt();
		System.out.println("两个数中的最大值为："+math.max(a1, a2));
		System.out.print("\n请输入一个整数：");
		int b=input.nextInt();
		System.out.println("这个整数的个位数为："+math.gewei(b));
		System.out.print("\n请输入一个整数：");
		int c=input.nextInt();
		System.out.println("这个整数的立方为："+math.lifang(c));
		System.out.print("\n请输入一个正整数：");
		int d=input.nextInt();
		System.out.println("从1加到此整数的和为："+math.add(d));
	}
}
