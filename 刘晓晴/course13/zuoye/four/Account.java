package course13.zuoye;

import java.util.*;

public class Account {
	Scanner input=new Scanner(System.in);
	public void index(double sum){
		System.out.println("1.��� 2.ȡ�� 0.�˳�");
		System.out.print("��ѡ������Ҫ�����ҵ��");
		int num=input.nextInt();
		if(num==1){
			cun(sum);
		}else if(num==2){
			qu(sum);
		}else if(num==0){
			System.out.println("ллʹ�ã�");
			System.exit(0);
		}else{
			System.out.println("�������");
		}
	}
	public void cun(double sum){
		System.out.print("���������");
		int money=input.nextInt();
		System.out.println("���ɹ�");
		sum+=money;
		System.out.println("\n*****��ǰ���Ϊ��"+sum+"Ԫ****\n");
		index(sum);
	}
	public void qu(double sum){
		System.out.print("������ȡ���");
		int money=input.nextInt();
		if(money<=sum){
			System.out.println("ȡ��ɹ�");
			sum-=money;
			System.out.println("\n*****��ǰ���Ϊ��"+sum+"Ԫ****");
			index(sum);
		}else{
			System.out.println("���㣡");
		}
		
	}
}
