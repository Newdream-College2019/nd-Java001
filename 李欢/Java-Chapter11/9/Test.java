package chapter11;

import java.util.Scanner;

public class Test {
	public int jiecheng(int n){
		if(n<=1){
			return 1;
		}
		return n*jiecheng(n-1);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Test test=new Test();
		System.out.print("请输入一个数:");
		int n=input.nextInt();
		System.out.println(n+"的阶乘："+test.jiecheng(n));

	}

}
