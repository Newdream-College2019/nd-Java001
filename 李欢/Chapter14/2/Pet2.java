package chapter14;

import java.util.Scanner;

public class Pet2 {
	public static void main(String[] args) {
		String name = null;
		String strain = null;
		int num;
		String sex = null;
		System.out.println("��ӭ����������꣡");
		Scanner input=new Scanner(System.in);
		Dog dog=new Dog(name,strain);
		Penguin penguin=new Penguin();
		Pig pig=new Pig();
		System.out.print("������Ҫ������������֣�");
		name=input.next();  
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������2�����3����");
		int type=input.nextInt();
		if(type==1){
			System.out.print("��ѡ�񹷹���Ʒ�֣���1����������������Ȯ2������ѩ����");
			num=input.nextInt();
			if(num==1){
				strain="��������������Ȯ";
				dog.print(name,strain);
			}else{
				strain="����ѩ����";
				dog.print(name,strain);
			}
		}else if(type==2){
			System.out.print("��ѡ�������Ա𣺣�1��Q��2��Q�ã�");
			int num2=input.nextInt();
			if(num2==1){
				sex=Penguin.SEX_MALE;
				penguin.print(name, sex);
			}else if(num2==2){
				sex=Penguin.SEX_FEMALE;
				penguin.print(name, sex);
			}
		}else if(type==3){
			System.out.print("��ѡ�����ë����ɫ����1����2���ڣ�");
			String color=null;
			int num3=input.nextInt();
			if(num3==1){
				color="��";
				pig.print(name, color);
			}else if(num3==2){
				color="��";
				pig.print(name, color);
			}else{
			System.out.println("��������");
		}
		
	}
	}
}