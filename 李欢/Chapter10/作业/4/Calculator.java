package chapter10;

import java.util.Scanner;

public class Calculator {
	int num1,num2;
	public void show(){
	Scanner input= new Scanner(System.in);
	System.out.print("请输入第一个整数：");
	num1=input.nextInt();
	System.out.print("请输入第二个整数：");
	num2=input.nextInt();
	}
	public void add(){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public void subtract(){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	public void multiply(){
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	public void divide(){
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
}
