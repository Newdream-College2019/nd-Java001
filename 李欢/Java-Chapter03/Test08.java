import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n\n");
		System.out.print("请输入会员号（<4位整数>）：");
		String num=input.next();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String birth=input.next();
		System.out.print("请输入积分：");
		int jifen=input.nextInt();
		if(num.length()==4){
			System.out.println("已录入的会员信息是：");
			System.out.println(num+"\t"+birth+"\t"+jifen);
		}else{
			System.out.println("会员号位数不对！！！");
		}
	}
}