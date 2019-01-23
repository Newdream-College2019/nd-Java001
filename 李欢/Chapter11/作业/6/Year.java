package chapter11;

import java.util.Scanner;

public class Year {
	public String check(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int year=input.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			return year+"是闰年";
		}else{
			return year+"是平年";
		}
	}
	public static void main(String[] args) {
		Year y=new Year();
		System.out.println(y.check());

	}
}
