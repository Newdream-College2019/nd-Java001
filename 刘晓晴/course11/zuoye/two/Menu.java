package course11;

import java.util.*;
public class Menu {
	/**
	 * @author С��
	 * @version 1.0��*/
	int num;
	String name="newdream";
	String password="0000";
	Scanner input=new Scanner(System.in);
	/**��ʾ��ҳ*/
	public void show(){
		System.out.println("\n��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t1.��¼ϵͳ");
		System.out.println("\t2.�˳�\n");
		System.out.println("********************************");
		System.out.print("��ѡ���������֣�");
		num=input.nextInt();
		if(num==1){
			showLoginMenu();
		}else if(num==2){
			System.exit(0);
		}else{
			System.out.println("�������");
		}
	}
	/**��ʾ��½ҳ��*/
	public void showLoginMenu(){
		System.out.print("�������û�����");
		String name1=input.next();
		System.out.print("���������룺");
		String password1=input.next();
		if(name.equals(name1)&&password.equals(password1)){
			showMainMenu();
		}else{
			System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��@@");
		}
	}
	/**��ʾ��ҳ��*/
	public void showMainMenu(){
		System.out.println("\n�������ع������ϵͳ���˵�");
		System.out.println("********************************\n");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\n********************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		num=input.nextInt();
		if(num==1){
			showCustMenu();
		}else if(num==2){
			SendGMenu();
		}else if(num==0){
			show();
		}else{
			System.out.println("�������");
		}
	}
	/**��ʾ�ͻ���Ϣ����ҳ��*/
	public void showCustMenu(){
		System.out.println("\n�������ع������ϵͳ���ͻ���Ϣ����");
		System.out.println("********************************\n");
		System.out.println("\t1.�鿴�û��û���Ϣ");
		System.out.println("\t2.����û���Ϣ");
		System.out.println("\t3.�˳�");
		System.out.println("\n********************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		num=input.nextInt();
		if(num==1){
			System.out.println("ִ�в鿴�û���Ϣ");
		}else if(num==2){
			System.out.println("ִ������û���Ϣ");
		}else if(num==3){
			System.exit(0);
		}else if(num==0){
			showMainMenu();
		}else{
			System.out.println("�������");
		}
	}
	/**��ʾ�������ҳ��*/
	public void SendGMenu(){
		System.out.println("\n�������ع������ϵͳ���������");
		System.out.println("********************************\n");
		System.out.println("\t1.���˴����");
		System.out.println("\t2.���˳齱");
		System.out.println("\t3.�����ʺ�");
		System.out.println("\n********************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		num=input.nextInt();
		if(num==1){
			System.out.println("ִ�����˴����");
		}else if(num==2){
			System.out.println("ִ�����˳齱");
		}else if(num==3){
			System.out.println("ִ�������ʺ�");
		}else if(num==0){
			showMainMenu();
		}else{
			System.out.println("�������");
		}
	}
}
