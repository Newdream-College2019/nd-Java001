package chapter13_1;

import java.util.Scanner;

public class Calculator {
	public void pay(double rate,int money,int year){
		double aRate=money*rate;
		System.out.println("����ϢΪ��"+aRate);
		double monthPay=(money+aRate)/year/12;
		System.out.println("�»�����Ϊ��"+monthPay);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ����Ľ�");
		int money=input.nextInt();
		System.out.print("���������������ޣ�");
		int year=input.nextInt();
		double rate=0.2;
		Calculator cal=new Calculator();
		cal.pay(rate, money, year);
		
	}
}
