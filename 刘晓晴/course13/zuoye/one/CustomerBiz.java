package course13.zuoye;

import java.util.*;
public class CustomerBiz {
	String[] name=new String[5];
	Scanner input=new Scanner(System.in);
	int index=0;
	public void addCus(){
		for(int i=0;i<name.length;i++){
			System.out.print("������ͻ���������");
			String kh=input.next();
			name[i]=kh;
			index=i;
			System.out.print("���������𣿣�y/n��:");
			String answer=input.next();
			if(answer.equals("n")){
				break;
			}
			
		}
		System.out.println("*******************************");
	}
	public void show(){
		System.out.println("\t�ͻ������б�");
		System.out.println("*******************************");
		for(int i=0;i<=index;i++){
			System.out.print(name[i]+"\t");
		}
	}
}
