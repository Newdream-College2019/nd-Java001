package course13.zuoye;

import java.util.Scanner;

public class Triangle {
	public void innit(){
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.print("�������һ���ߣ�");
			int a=input.nextInt();
			System.out.print("�������һ���ߣ�");
			int b=input.nextInt();
			System.out.print("�������һ���ߣ�");
			int c=input.nextInt();
			isTriangle(a, b, c);
			System.out.print("�����𣿣�y/n��:");
			String answer=input.next();
			if(answer.equals("n")){
				System.out.println("ллʹ�ã�");
				break;
			}
		}
	}
	public void isTriangle(int a,int b,int c){
		if(a+b>c&&a+c>b&&a-b<c&&a-c<b){
			type(a,b,c);
		}else{
			System.out.println("�ⲻ�ܹ��������Σ�");
		}
	}
	public void type(int a,int b,int c){
		if(a==b&&b==c){
			System.out.println("����һ���ȱ������Ρ�");
		}else if(a==b||a==c||b==c){
			System.out.println("����һ���ȱ������Ρ�");
		}else if((a+b)==c*c||(a+c)==b*b||(b+c)==a*a){
			System.out.println("����һ��ֱ�������Ρ�");
		}else if((a+b)>c*c||(a+c)>b*b||(b+c)>a*a){
			System.out.println("����һ���۽������Ρ�");
		}else{
			System.out.println("����һ����������Ρ�");
		}
	}
	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		t.innit();
		
	}
}
