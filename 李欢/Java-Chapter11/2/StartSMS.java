package chapter11;

import java.util.Scanner;

public class StartSMS {
	public static void main(String[] args) {
		System.out.println("********************************************\n");
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t\t1.��¼ϵͳ");
		System.out.println("********************************************");
		System.out.print("��ѡ���������֣�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num==1){
			System.out.print("�������û�����");
			String name=input.next();
			System.out.print("���������룺");
			String password=input.next();
			if(name.equals("admin")&&password.equals("123456")){
				System.out.println("��½�ɹ���");
			}else{
				System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼@@");
			}
		}
	}
}
