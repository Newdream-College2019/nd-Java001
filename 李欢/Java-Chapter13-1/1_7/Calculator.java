package chapter13_1;

import java.util.Scanner;

public class Calculator {
	public void pay(double rate,int money,int year){
		double aRate=money*rate;
		System.out.println("总利息为："+aRate);
		double monthPay=(money+aRate)/year/12;
		System.out.println("月还款金额为："+monthPay);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要贷款的金额：");
		int money=input.nextInt();
		System.out.print("请输入需贷款的年限：");
		int year=input.nextInt();
		double rate=0.2;
		Calculator cal=new Calculator();
		cal.pay(rate, money, year);
		
	}
}
