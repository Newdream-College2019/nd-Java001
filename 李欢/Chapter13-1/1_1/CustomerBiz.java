package chapter13_1;

import java.util.Scanner;
public class CustomerBiz {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String answer = null;
		String[] name=new String[4];
		do{
			for(int i=0;i<name.length;i++){
			System.out.print("������ͻ���������");
			name[i]=input.next();
			System.out.print("���������𣿣�y/n����");
			answer=input.next();
			}
		}while(!answer.equals("n"));
		System.out.println("************************************");
		System.out.println("\n\t\t�ͻ������б�");
		System.out.println("************************************");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+"\t");
		}
	}
}
