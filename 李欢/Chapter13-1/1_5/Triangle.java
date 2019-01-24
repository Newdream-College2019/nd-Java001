package chapter13_1;

import java.util.Scanner;

public class Triangle {
	public void printTriangle(int row,String ch){
		int zifu=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=zifu;j++){
			System.out.print(ch);
			}
			zifu+=1;;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Triangle pt=new Triangle();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入行高:");
		int row=input.nextInt();
		System.out.print("请输入打印的字符:");
		String ch=input.next();
		pt.printTriangle(row, ch);
		
	}
}
