import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a=input.nextInt();
		System.out.print("请输入一个整数：");
		int b =input.nextInt();
		System.out.print("请输入一个整数：");
		int c=input.nextInt();
		int temp;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}
}