package course13.zuoye;

import java.util.*;
public class StuM {
	String[] name=new String[5];
	int index;
	String stu2;
	
	Scanner input=new Scanner(System.in);
	public void addStu(){
		for(int i=0;i<name.length;i++){
			System.out.print("������ͻ���������");
			String stu=input.next();
			name[i]=stu;
		}
		System.out.println("*******************************");
	}
	
	public void updateStu(){
		System.out.print("\n������Ҫ�޸ĵĿͻ�������");
		String stu=input.next();
		for(int i=0;i<name.length;i++){
			if(name[i].equals(stu)){
				System.out.print("�������µĿͻ�������");
				stu2=input.next();
				name[i]=stu2;
				index=i;
			}
		}
	}
	public void find(){
		System.out.println("\n*******�޸Ľ��*******");
		if(name[index].equals(stu2)){
			System.out.println("�ҵ����޸ĳɹ���");
			System.out.println("*******************************");
		}else{
			System.out.println("�޸�ʧ��");
		}
	}
	
	public void show(){
		System.out.println("\t\t�ͻ������б�");
		System.out.println("*******************************");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+"\t");
		}
	}
}
