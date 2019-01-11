import java.util.Scanner;
public class Two{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统》客户信息管理》添加客户信息");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int num=input.nextInt();
			System.out.print("请选择会员生日（月/日<用两位整数表示>）：");
			String date=input.next();
			System.out.print("请输入会员积分：");
			int sum=input.nextInt();
			if(num/1000>0&&num/1000<10){
				System.out.println("您录入的会员信息是：");
				System.out.println(num+"\t"+date+"\t"+sum);
				System.out.println();
			}else{
				System.out.println("录入失败");
				break;
			}
		}
		System.out.println();
		System.out.println("程序结束");
	}
}