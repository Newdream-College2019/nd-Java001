package chapter12;

import java.util.Scanner;

public class Game {
	Scanner input=new Scanner(System.in);
	Person person=new Person();
	Computer comp=new Computer();
	int comScore=0;
	int perScore=0;
	public void inital(){	
		System.out.println("-----------------��ӭ������Ϸ����---------------\n\n");
		System.out.println("\t\t*********************");
		System.out.println("\t\t**     ��ȭ����ʼ       **");
		System.out.println("\t\t*********************");
		System.out.println("\n\n��ȭ����1.����2.ʯͷ3.��");
		System.out.print("��ѡ��Է���ɫ����1������ 2����Ȩ 3���ܲ٣���");
		int a=input.nextInt();
		if(a==1){
			comp.name="����";
			System.out.println("��ѡ����������ս");
		}else if(a==2){
			comp.name="��Ȩ";
			System.out.println("��ѡ������Ȩ��ս");
		}else if(a==3){
			comp.name="�ܲ�";
			System.out.println("��ѡ���˲ܲٶ�ս");
		}else{
			System.out.println("�������󣡣���");
		}
		System.out.print("���������������");
		String name=input.next();
		person.name=name;
		System.out.println(person.name+" VS "+comp.name+" ��ս");
	}
	public void startGame(){
		int count=0;
		System.out.print("\nҪ��ʼ����y/n):");
		String tt=input.next();
		while(!tt.equals("n")){
			if(tt.equals("y")){
				int per=person.showFirst();
				int com=comp.getChoice();	
				showResult(per, com);
			}
		count++;
		System.out.print("\n\n�Ƿ�ʼ��һ�֣�y/n):");
		tt=input.next();
		}
		System.out.println("\nһ��������"+count+"��");
		System.out.println("����\t\t�÷�");
		System.out.println(person.name+"\t\t"+perScore);
		System.out.println(comp.name+"\t\t"+comScore);
		if(perScore>comScore){
			System.out.println("\n�������ϲ��ϲ��");
		}else{
			System.out.println("\n������Ǻǣ��������´μ��Ͱ���");
		}
	}
	public void showResult(int per,int com){
		if(per==com){
					System.out.println("���˵���;֣���˥���ٺ٣������ưɣ�");
				}else if(per-com==-1||per-com==2){
					System.out.println("���˵�������ˣ��汿��");
					comScore++;
				}else{
					System.out.println("���˵����ϲ��Ӯ�ˣ�");
					perScore++;
				}
		
	}
	

}
