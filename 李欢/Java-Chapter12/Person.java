package chapter12;

import java.util.Scanner;

public class Person {
	String name;
	String score;
	public int showFirst(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n���ȭ��1.������2.ʯͷ��3.����������Ӧ���֣�:");
		int a=input.nextInt();
		if(a==1){
			System.out.println("���ȭ������");
		}else if(a==2){
			System.out.println("���ȭ��ʯͷ");
		}else if(a==3){
			System.out.println("���ȭ����");
		}else{
			System.out.println("�������󣡣���");
		}
		return a;
	}
}
