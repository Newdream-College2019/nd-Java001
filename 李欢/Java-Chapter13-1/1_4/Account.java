package chapter13_1;

import java.util.Scanner;

public class Account {
	Scanner input=new Scanner(System.in);
	double sum=0;
	public void save(int cun){
		System.out.print("���������");
		cun=input.nextInt();
		System.out.println("���ɹ�");
		sum+=cun;
		System.out.println("\n***��ǰ���Ϊ��"+sum+"***");
	}
	public void get(int qu){
		System.out.print("������ȡ���");
		qu=input.nextInt();
		System.out.println("ȡ��ɹ�");
		sum-=qu;
		System.out.println("\n***��ǰ���Ϊ��"+sum+"***");
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Account ac=new Account();
		int num;
		int cun=0;
		int qu=0;
		do{
			System.out.println("1.���2.ȡ��0.�˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��");
			num=input.nextInt();
			if(num==1){
				ac.save(cun);
			}else if(num==2){
				ac.get(qu);
			}else if(num==0){
				System.out.println("ллʹ�ã�");
			}
			else {
				System.out.println("��������");
			}
		}while(num!=0);
		
	}
}
