package chapter13_1;

import java.util.Scanner;

public class xuanzuo {
	public	void made(int a,int b,int c){
			if((a+b)>c&&(a+c)>b&&(b+c)>a){
				triangle(a, b, c);
			}else{
				System.out.println("�ⲻ�ܹ���������");
			}
	}
	public void triangle(int a,int b,int c){
		if((a*a==(b*b+c*c))||(b*b==(a*a+c*c))||(c*c==(a*a+b*b))){
			System.out.println("����һ��ֱ��������");
		}else if((a*a>(b*b+c*c))||(b*b>(a*a+c*c))||(c*c>(a*a+b*b))){
			System.out.println("����һ���۽�������");
		}else if(a==b&&b==c&&a==c){
			System.out.println("����һ���ȱ�������");
		}
		else{
			System.out.println("����һ�����������");
		}
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		xuanzuo xz=new xuanzuo();
		String answer="";
		while(!answer.equals("n")){
			System.out.print("�������һ���ߣ�");
			int a=input.nextInt();
			System.out.print("������ڶ����ߣ�");
			int b=input.nextInt();
			System.out.print("������������ߣ�");
			int c=input.nextInt();
			xz.made(a, b, c);
			System.out.print("�����𣿣�y/n����");
			answer=input.next();
		}
		System.out.println("ллʹ�ã�");
		
	}
}
