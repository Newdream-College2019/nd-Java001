package chapter15;

import java.util.Scanner;


public class TestPet {
	public static void main(String[] args) {
		String name = null;
		String strain = null;
		int num;
		String sex = null;
		System.out.println("��ӭ����������꣡");
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ������������֣�");
		name=input.next();  
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������2����죩");
		int type=input.nextInt();
		if(type==1){
			System.out.print("��ѡ�񹷹���Ʒ�֣���1����������������Ȯ2������ѩ����");
			num=input.nextInt();
			if(num==1){
				strain="��������������Ȯ";
			}else{
				strain="����ѩ����";
			}
			Dog dog=new Dog(name,strain);
			dog.print();
		}else if(type==2){
			System.out.print("��ѡ�������Ա𣺣�1��Q��2��Q�ã�");
			int p=input.nextInt();
			if(p==1){
				sex="Q��";
			}else if(p==2){
				sex="Q��";				
			}
			Penguin penguin=new Penguin(name,sex);
			penguin.print();
		}else{
			System.out.println("��������");
		}
		
	}

}
