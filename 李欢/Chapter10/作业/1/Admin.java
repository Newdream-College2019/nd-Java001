package chapter10;

import java.util.Scanner;

public class Admin {
	String username;
	String password;
	public void show(){
		System.out.println("������"+username+",���룺"+password);
	}
	public void rePassword(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n�����������룺");
		password=input.next();
		System.out.println("�޸�����ɹ�������������Ϊ��"+password);
	}
}
