package chapter11;

import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
		String good;
		int price;
		Scanner input=new Scanner(System.in);
		public void initial(){
			Random ran=new Random();
			int num=ran.nextInt(3);
			if(num==1){
				good="�����綯��";
				price=2200;
			}else if(num==2){
				good="ɽ�����г�";
				price=800;
			}else{
				good="Ħ�г�";
				price=2200;
			}
		}
		public void guess(){
			System.out.print("��²⡰"+good+"���ļ۸�");
			int num=input.nextInt();
			for(int i=0;i<4;i++){
				if(price==num){
					System.out.println("�¶��ˣ�");
					break;
				}else if(price>num){
					System.out.println("�ٴ�㣡");
					System.out.print("\n�ٲ�һ�ΰɣ�");
					num=input.nextInt();
					if(i==2){
						System.out.println("\n4����û�в¶ԣ��´�Ŭ���ɣ�");
						break;
					}
				}else{
					System.out.println("��С�㣡");
					System.out.print("\n�ٲ�һ�ΰɣ�");
					num=input.nextInt();
					if(i==2){
						System.out.println("\n4����û�в¶ԣ��´�Ŭ���ɣ�");
						break;
					}
				}
			}
		}
}
