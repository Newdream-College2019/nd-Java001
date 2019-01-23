package chapter13_1;

import java.util.Scanner;

public class xuanzuo {
	public	void made(int a,int b,int c){
			if((a+b)>c&&(a+c)>b&&(b+c)>a){
				triangle(a, b, c);
			}else{
				System.out.println("这不能构成三角形");
			}
	}
	public void triangle(int a,int b,int c){
		if((a*a==(b*b+c*c))||(b*b==(a*a+c*c))||(c*c==(a*a+b*b))){
			System.out.println("这是一个直角三角形");
		}else if((a*a>(b*b+c*c))||(b*b>(a*a+c*c))||(c*c>(a*a+b*b))){
			System.out.println("这是一个钝角三角形");
		}else if(a==b&&b==c&&a==c){
			System.out.println("这是一个等边三角形");
		}
		else{
			System.out.println("这是一个锐角三角形");
		}
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		xuanzuo xz=new xuanzuo();
		String answer="";
		while(!answer.equals("n")){
			System.out.print("请输入第一条边：");
			int a=input.nextInt();
			System.out.print("请输入第二条边：");
			int b=input.nextInt();
			System.out.print("请输入第三条边：");
			int c=input.nextInt();
			xz.made(a, b, c);
			System.out.print("继续吗？（y/n）：");
			answer=input.next();
		}
		System.out.println("谢谢使用！");
		
	}
}
