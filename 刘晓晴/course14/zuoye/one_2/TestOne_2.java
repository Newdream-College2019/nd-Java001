package course14;

import java.util.*;
public class TestOne_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		String type;
		String strain = null;
		String sex = null;
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ�(1������ 2�����)");
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
			Dog dog=new Dog();
			dog.setName(name);
			dog.setStrain(strain);
			System.out.println("�����԰ף�");
			System.out.println("�ҵ����ֽ�"+dog.getName()+",����ֵ��"+dog.getHealth()+",�����˵����ܶ���"+dog.getLove()+",����һֻ������"+dog.getStrain());
		}else{
			type="���";
			System.out.print("��ѡ�������Ա�(1��Q�� 2��Q��)");
			int p=input.nextInt();
			if(p==1){
				sex="Q��";
			}else if(p==2){
				sex="Q��";
			}
			Penguin penguin=new Penguin();
			penguin.setName(name);
			penguin.setSex(sex);
			System.out.println("�����԰ף�");
			System.out.println("�ҵ����ֽ�"+penguin.getName()+",����ֵ��"+penguin.getHealth()+",�����˵����ܶ���"+penguin.getLove()+",���Ǵ�����"+penguin.getSex());
		} 
	
		
	}
}
