package chapter11;

import java.util.Scanner;

public class Menu {
	Scanner input=new Scanner(System.in);
	public void showLoginMenu(){
		System.out.println("*************************************************\n");
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t\t1.��¼ϵͳ\n");
		System.out.println("\t\t\t2.�˳�\n");
		System.out.println("*************************************************");
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		if(a==1){
			showMainMenu();
		}else if(a==2){
			System.out.println("�˳�ϵͳ����");
		}else {
			System.out.println("�������󣡣�");
		}
	}
	public void showMainMenu(){
		System.out.println("\n*************************************************\n");
		System.out.println("\t\t�������ع������ϵͳ���˵�\n");
		System.out.println("\t\t\t1.�ͻ���Ϣ����\n");
		System.out.println("\t\t\t2.�������\n");
		System.out.println("*************************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int b=input.nextInt();
		if(b==1){
			showCustMenu();
		}else if(b==2){
			showSendMenu();
		}else if(b==0){
			showLoginMenu();
		}else{
			System.out.println("��������");
		}
	}
	public void showCustMenu(){
		System.out.println("\n*************************************************\n");
		System.out.println("\t\t�������ع������ϵͳ>�ͻ�����ϵͳ\n");
		System.out.println("\t\t\t1.��ѯ�ͻ���Ϣ\n");
		System.out.println("\t\t\t2.�޸Ŀͻ���Ϣ\n");
		System.out.println("\t\t\t3.��ӿͻ���Ϣ\n");
		System.out.println("\t\t\t4.��ʾ���пͻ���Ϣ\n");
		System.out.println("*************************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int c=input.nextInt();
		if(c==1){
			System.out.println("ִ�в�ѯ�ͻ���Ϣ");
		}else if(c==2){
			System.out.println("ִ���޸Ŀͻ���Ϣ");
		}else if(c==3){
			System.out.println("ִ����ӿͻ���Ϣ");
		}else if(c==4){
			System.out.println("ִ����ʾ���пͻ���Ϣ");
		}else if(c==0){
			showMainMenu();
		}else{
			System.out.println("��������");
		}
		
	}
	public void showSendMenu(){
		System.out.println("\n*************************************************\n");
		System.out.println("\t\t�������ع������ϵͳ>�������\n");
		System.out.println("\t\t\t1.���˴����\n");
		System.out.println("\t\t\t2.���˳齱\n");
		System.out.println("\t\t\t3.�����ʺ�\n");
		System.out.println("*************************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int aa=input.nextInt();
		if(aa==1){
			System.out.println("ִ�����˴����");
		}else if(aa==2){
			System.out.println("ִ�����˳齱");
		}else if(aa==3){
			System.out.println("ִ�������ʺ�");
		}else if(aa==0){
			showMainMenu();
		}else{
			System.out.println("��������");
		}
	}
	
}
