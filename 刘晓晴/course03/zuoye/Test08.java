import java.util.*;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.println();
		System.out.print("请输入会员号（<4位整数>）：");
		int num=input.nextInt();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String birthday=input.next();
		System.out.print("请输入积分：");
		int sum=input.nextInt();
		if(num>999&&num<10000){
			System.out.println("已录入的会员信息是：");
			System.out.println(num+"\t"+birthday+"\t"+sum);
		}else{
			System.out.println("会员号输入不合法");	
		}
	}

}