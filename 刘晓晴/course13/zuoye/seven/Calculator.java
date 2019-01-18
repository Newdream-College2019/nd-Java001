package course13.zuoye;

import java.util.*;
public class Calculator {
	double zlx,yje;
	int year;
	double rate=0.25;
	public void gross(int money){
		zlx=money*rate;
		System.out.println("总利息："+zlx);
	}
	public void ySum(int money,int year){
		yje=(money+zlx)/(year*12);
		System.out.println("月还款金额："+yje);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator c=new Calculator();
		
		System.out.print("请输入贷款金额：");
		int money=input.nextInt();
		System.out.print("\n请输入贷款年限：");
		int year=input.nextInt();
		c.gross(money);
		c.ySum(money, year);
		
	}
}
