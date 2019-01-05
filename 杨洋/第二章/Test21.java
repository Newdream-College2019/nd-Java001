import java.util.Scanner;
public class Test21{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入会员号(<四位整数>)：");
		int a,b,c;
		a=input.nextInt();
		if((a/1000)<1||(a/1000)>=10){
			System.out.print("输入不合法，请重新输入：");
			a=input.nextInt();
			System.out.print("请输入会员生日(月/日<用两位数表示>)：");
			b=input.nextInt();
		}else{
			System.out.print("请输入会员生日(月/日<用两位数表示>)：");
			b=input.nextInt();
		}
		if((b/1000)<1||(b/1000)>=10){
			System.out.print("输入不合法，请重新输入：");
			b=input.nextInt();
			System.out.print("请输入积分：");
			c=input.nextInt();
		}else{
			System.out.print("请输入积分：");
			c=input.nextInt();
		}
		System.out.println("\n");
		System.out.println("已录入的会员信息是：");
		System.out.println(a+"\t"+b+"\t"+c);
	}
}