package chapter11;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	public void show(){
	Scanner input= new Scanner(System.in);
	System.out.print("�������һ��������");
	num1=input.nextInt();
	System.out.print("������ڶ���������");
	num2=input.nextInt();
	}
	public void add(){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public void minus(){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	public void multiple(){
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	public void divide(){
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
}
