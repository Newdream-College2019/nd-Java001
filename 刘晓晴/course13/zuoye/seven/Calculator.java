package course13.zuoye;

import java.util.*;
public class Calculator {
	double zlx,yje;
	int year;
	double rate=0.25;
	public void gross(int money){
		zlx=money*rate;
		System.out.println("����Ϣ��"+zlx);
	}
	public void ySum(int money,int year){
		yje=(money+zlx)/(year*12);
		System.out.println("�»����"+yje);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator c=new Calculator();
		
		System.out.print("����������");
		int money=input.nextInt();
		System.out.print("\n������������ޣ�");
		int year=input.nextInt();
		c.gross(money);
		c.ySum(money, year);
		
	}
}
