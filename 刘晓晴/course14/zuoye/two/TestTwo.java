package course14;

import java.util.*;
public class TestTwo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		String type;
		String strain = null;
		String sex = null;
		String color = null;
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ�(1������ 2����� 3����)");
		int n=input.nextInt();
		if(n==1){
			type="����";
			System.out.print("��ѡ�񹷹���Ʒ�֣�(1����������������Ȯ 2������ѩ����)");
			int p=input.nextInt();
			if(p==1){
				strain="��������������Ȯ";
			}else if(p==2){
				strain="����ѩ����";
			}
			Dog dog=new Dog(name,strain);
			//dog.setName(name);
			//dog.setStrain(strain);
			dog.show();
		}else if(n==2){
			type="���";
			System.out.print("��ѡ�������Ա�(1��Q�� 2��Q��)");
			int p=input.nextInt();
			if(p==1){
				//sex="Q��";
				sex=Penguin.SEX_MALE;
			}else if(p==2){
				//sex="Q��";
				sex=Penguin.SEX_FEMALE;
			}
			Penguin penguin=new Penguin();
			penguin.setName(name);
			penguin.setSex(sex);
			penguin.show();
		} else{
			type="��";
			System.out.print("��ѡ�����ë����ɫ��(1����ɫ 2����ɫ)");
			int p=input.nextInt();
			if(p==1){
				color="��ɫ";
			}else if(p==2){
				color="��ɫ";
			}
			Pig pig=new Pig();
			pig.setName(name);
			pig.setColor(color);
			pig.show();
		}
	
		
	}
}
