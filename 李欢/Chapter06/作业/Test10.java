import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int num=input.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）:");
			String birth=input.next();
			System.out.print("请输入会员积分：");
			int score=input.nextInt();
			System.out.println("您录入的会员信息是：");
			System.out.println(num+"\t"+birth+"\t"+score);
			System.out.println();
		}
		System.out.println("程序结束！");
	}
}