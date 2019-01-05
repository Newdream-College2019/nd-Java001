import java.util.Scanner;
public class AddCust
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("我行我素购物管理系统 > 客户信息管理\n");
		System.out.print("请输入会员号(<4位整数>):");
		int num = in.nextInt();
		if(!(num/1000>0&&num/1000<10)){
			System.out.print("输入的会员号不合法！");
		}else{
		System.out.print("请输入会员生日(月/日<用两位数表示>):");
		String birth = in.next();
		System.out.print("请输入积分：");
		int jifen = in.nextInt();
		System.out.println("\n已录入的会员信息是：\n"+num+"\t"+birth+"\t"+jifen);
			}
	}
}
