package course12;

import java.util.*;

public class Game {
	Player person;
	Computer comp; 
	int count=0;
	Scanner input=new Scanner(System.in);
	public void initial(){
		person=new Player();
		comp=new Computer();
		System.out.println("-----------------��ӭ������Ϸ����------------------");
		System.out.println("\n\t\t**************");
		System.out.println("\t\t**��ȭ����ʼ**");
		System.out.println("\t\t**************\n");
		
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		System.out.print("��ѡ��Է���ɫ����1.���� 2.��Ȩ 3.�ܲ٣�:");
		int num=input.nextInt();
		if(num==1){
			comp.name="����";
			System.out.println("��ѡ����������ս");
		}else if(num==2){
			comp.name="��Ȩ";
			System.out.println("��ѡ������Ȩ��ս");
		}else if(num==3){
			comp.name="�ܲ�";
			System.out.println("��ѡ���˲ܲٶ�ս");
		}else{
			System.out.println("�������");
		}
		System.out.print("\n������������֣�");
		person.name=input.next();
		System.out.println(person.name+" VS "+comp.name+" ��ս");
		
	}
	public void starGame(){
		System.out.print("\nҪ��ʼ�𣿣�y/n��:");
		String answer=input.next();
		int pChoice=0,cChoice=0;
		while(answer.equals("y")){
			System.out.print("\n���ȭ��1.���� 2.ʯͷ 3.����������Ӧ�����֣���");
			pChoice=person.getChoice();
			cChoice=comp.getChioce();
			if((cChoice-pChoice)==0){
				System.out.println("������;֣���˥���ٺ٣������ưɣ�");
			}else if((cChoice-pChoice)==-2||(cChoice-pChoice)==1){
				System.out.println("�����^_^,������,�汿��");
				comp.score++;
			}else{
				System.out.println("�������ϲ����Ӯ�ˣ�");
				person.score++;
			}
			System.out.print("\n�Ƿ������һ�֣���y/n��:");
			answer=input.next();
			count++;
		}
	}
	public void showFirst(){
		System.out.println("------------------------------------------");
		System.out.println(comp.name+" VS "+person.name);
		System.out.println("\n��ս������"+count);
		System.out.println("����\t\t�÷�");
		System.out.println(person.name+"\t\t"+person.score);
		System.out.println(comp.name+"\t\t"+comp.score);
		if(person.score>comp.score){
			System.out.println("\n�������ϲ��ϲ��");
		}else{
			System.out.println("\n������Ǻǣ��������´μ��Ͱ���");
		}
		
	}

}
