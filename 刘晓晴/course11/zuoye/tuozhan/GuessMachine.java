package course11;

import java.util.*;
public class GuessMachine {
	String good;
	int price;
	Scanner input=new Scanner(System.in);
	public void initial(){
		Random random=new Random();
		int num=random.nextInt(3);
		if(num==0){
			good="�����綯��";
			price=2800;
		}else if(num==1){
			good="ɽ�����г�";
			price=1200;
		}else{
			good="Ħ�г�";
			price=5500;
		}
	}
	public void guess(){
		int pr=0;
		System.out.print("��²�\""+good+"\"�ļ۸�");
		pr=input.nextInt();
		for(int i=0;i<4;i++){
			if(price==pr){
				System.out.println("��ϲ�㣬���³ɹ���");
				break;
			}else if(pr>price){
				System.out.println("��С�㣡");
				System.out.print("\n�ٲ�һ�ΰɣ�");
				pr=input.nextInt();
				if(i==2){
					System.out.println("4�ζ�û�в¶ԣ��´�Ŭ���ɣ�");
					break;
				}
			}else{
				System.out.println("�ٴ�㣡");
				System.out.print("\n�ٲ�һ�ΰɣ�");
				pr=input.nextInt();
				if(i==2){
					System.out.println("4�ζ�û�в¶ԣ��´�Ŭ���ɣ�");
					break;
				}
			}
		}
	}
}
