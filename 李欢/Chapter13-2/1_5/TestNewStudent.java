package chapter13_2;

import java.util.Scanner;

public class TestNewStudent {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		NewStudent ns=new NewStudent();
		ns.name="�";
		ns.age=20;
		ns.sex="Ů��";
		System.out.println(ns.toString());
	//6.	
		int[] arr=new int[]{2,3,9,16,57,67};
		System.out.print("\n�������ֵΪ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n���������������֮��Ϊ��");
		System.out.println(ns.add(arr));
	//7.	
		System.out.print("\n������һ������(1~10)��");
		int num=input.nextInt();
		if(num<10&&num>=1){
			System.out.println("������n�Ļ�Ϊ��"+ns.ji(num));
		}else{
			System.out.println("����n������1~10 ֮�䣡����");
		}
	//8.
		System.out.print("\n������һ������n��");
		int num2=input.nextInt();
		System.out.println(ns.prime(num2));
	//9.
		System.out.print("\n�������һ����������");
		int a=input.nextInt();
		System.out.print("������ڶ�����������");
		int b=input.nextInt();
		System.out.println(a+"��"+b+"����С������Ϊ"+ns.minBei(a, b));
	//10.
		System.out.print("\n�������һ��������");
		int c=input.nextInt();
		System.out.print("������ڶ���������");
		int d=input.nextInt();
		System.out.println(c+"��"+d+"�����Լ��Ϊ"+ns.maxYue(c, d));
	//11.
		System.out.print("\n������һ������n��");
		int num3=input.nextInt();
		System.out.println(ns.fblq(num3));
	//12.
		int[] brr=new int[]{5,78,24,7,26,67};
		System.out.print("\n�������ֵΪ��");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+"\t");
		}
		brr=ns.youxu(brr);
		System.out.print("\n�����������ֵΪ��");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+"\t");
		}
		
	//13.
		Chicken ch=new Chicken();
		if(ns.change(ch)!=null){
			System.out.println("\n\n��һֻ���ɹ�����һֻѼ");
		}else{
			System.out.println("��һֻ�����ܻ���һֻѼ");
		}
	}
}
