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
		System.out.print("�������и�:");
		int row=input.nextInt();
		System.out.print("�������ӡ���ַ�:");
		String ch=input.next();
		pt.printTriangle(row, ch);
		
	}
}
