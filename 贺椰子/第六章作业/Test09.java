import java.util.Scanner;
public class Test09{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("MyShopping管理系统 > 客户信息管理 > 添加客户信息\n");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int num = in.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			String bir = in.next();
			System.out.print("请输入会员积分：");
			int score = in.nextInt();
			if(num/1000>0&&num/1000<10){
				System.out.println("您录入的会员信息是：\n"+num+"\t"+bir+"\t"+score);
			}else{
				System.out.println("录入失败");
			}
		}
	}
}
