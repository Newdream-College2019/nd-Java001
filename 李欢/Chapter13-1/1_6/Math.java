package chapter13_1;

import java.util.Scanner;

public class Math {
	public int max(int a1,int a2){
		if(a1>a2){
			return a1;
		}else{
			return a2;
		}
	}
	public int gewei(int b){
		int bb=b%10;
		return bb;
	}
	public int lifang(int c){
		int cc=c*c*c;
		return cc;
	}
	public int add(int d){
		int sum=0;
		for(int i=d;i>=1;i--){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Math math=new Math();
		System.out.print("�������һ��������");
		int a1=input.nextInt();
		System.out.print("������ڶ���������");
		int a2=input.nextInt();
		System.out.println("�������е����ֵΪ��"+math.max(a1, a2));
		System.out.print("\n������һ��������");
		int b=input.nextInt();
		System.out.println("��������ĸ�λ��Ϊ��"+math.gewei(b));
		System.out.print("\n������һ��������");
		int c=input.nextInt();
		System.out.println("�������������Ϊ��"+math.lifang(c));
		System.out.print("\n������һ����������");
		int d=input.nextInt();
		System.out.println("��1�ӵ��������ĺ�Ϊ��"+math.add(d));
	}
}
