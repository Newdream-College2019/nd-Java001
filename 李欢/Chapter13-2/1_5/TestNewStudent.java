package chapter13_2;

import java.util.Scanner;

public class TestNewStudent {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		NewStudent ns=new NewStudent();
		ns.name="李欢";
		ns.age=20;
		ns.sex="女生";
		System.out.println(ns.toString());
	//6.	
		int[] arr=new int[]{2,3,9,16,57,67};
		System.out.print("\n该数组的值为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n该数组的所有数据之和为：");
		System.out.println(ns.add(arr));
	//7.	
		System.out.print("\n请输入一个整数(1~10)：");
		int num=input.nextInt();
		if(num<10&&num>=1){
			System.out.println("该整数n的积为："+ns.ji(num));
		}else{
			System.out.println("整数n必须在1~10 之间！！！");
		}
	//8.
		System.out.print("\n请输入一个整数n：");
		int num2=input.nextInt();
		System.out.println(ns.prime(num2));
	//9.
		System.out.print("\n请输入第一个整数：：");
		int a=input.nextInt();
		System.out.print("请输入第二个整数：：");
		int b=input.nextInt();
		System.out.println(a+"和"+b+"的最小公倍数为"+ns.minBei(a, b));
	//10.
		System.out.print("\n请输入第一个整数：");
		int c=input.nextInt();
		System.out.print("请输入第二个整数：");
		int d=input.nextInt();
		System.out.println(c+"和"+d+"的最大公约数为"+ns.maxYue(c, d));
	//11.
		System.out.print("\n请输入一个整数n：");
		int num3=input.nextInt();
		System.out.println(ns.fblq(num3));
	//12.
		int[] brr=new int[]{5,78,24,7,26,67};
		System.out.print("\n该数组的值为：");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+"\t");
		}
		brr=ns.youxu(brr);
		System.out.print("\n排序后该数组的值为：");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+"\t");
		}
		
	//13.
		Chicken ch=new Chicken();
		if(ns.change(ch)!=null){
			System.out.println("\n\n这一只鸡成功换回一只鸭");
		}else{
			System.out.println("这一只鸡不能换回一只鸭");
		}
	}
}
