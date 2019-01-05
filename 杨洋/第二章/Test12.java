import java.util.Scanner;
public class Test12{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入：");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d;
		int max;
		int min;
		if(a<b){
			d=a;
			a=b;
			b=d;
		}
		if(a<c){
			d=a;
			a=c;
			c=d;
		}
		if(b<c){
			d=b;
			b=c;
			c=d;
		}
		max=a;
		min=c;
		System.out.println("最大值为："+max+"\t"+"最小值为："+min);
	}
}