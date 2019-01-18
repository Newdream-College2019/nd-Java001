package course13.zuoye;

import java.util.Scanner;

public class Triangle {
	public void innit(){
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.print("请输入第一条边：");
			int a=input.nextInt();
			System.out.print("请输入第一条边：");
			int b=input.nextInt();
			System.out.print("请输入第一条边：");
			int c=input.nextInt();
			isTriangle(a, b, c);
			System.out.print("继续吗？（y/n）:");
			String answer=input.next();
			if(answer.equals("n")){
				System.out.println("谢谢使用！");
				break;
			}
		}
	}
	public void isTriangle(int a,int b,int c){
		if(a+b>c&&a+c>b&&a-b<c&&a-c<b){
			type(a,b,c);
		}else{
			System.out.println("这不能构成三角形！");
		}
	}
	public void type(int a,int b,int c){
		if(a==b&&b==c){
			System.out.println("这是一个等边三角形。");
		}else if(a==b||a==c||b==c){
			System.out.println("这是一个等边三角形。");
		}else if((a+b)==c*c||(a+c)==b*b||(b+c)==a*a){
			System.out.println("这是一个直角三角形。");
		}else if((a+b)>c*c||(a+c)>b*b||(b+c)>a*a){
			System.out.println("这是一个钝角三角形。");
		}else{
			System.out.println("这是一个锐角三角形。");
		}
	}
	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		t.innit();
		
	}
}
