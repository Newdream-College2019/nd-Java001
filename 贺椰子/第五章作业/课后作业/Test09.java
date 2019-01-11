import java.util.Scanner;
public class Test09{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("MyShopping管理系统 > 购物结算\n");
		System.out.println("**********************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("**********************************************");
		String s;
		double sum=0;
		String sp="";
		do{
		System.out.print("请输入商品编号：");
		int n = in.nextInt();
		System.out.print("请输入购买数量：");
		int num = in.nextInt();
		switch(n){
			case 1:
				sum+=245.0*num;
				sp+="T恤\t￥245.0\t\t数量："+num+"\t\t合计："+(245.0*num)+"\n";
				System.out.println(sp);break;
			case 2:
				sum+=334.0*num;
				sp+="网球鞋\t￥334.0\t\t数量："+num+"\t\t合计："+(334.0*num)+"\n";
				System.out.println(sp);break;
			case 3:
				sum+=188.0*num;
				sp+="网球拍\t￥188.0\t\t数量："+num+"\t\t合计："+(188.0*num)+"\n";
				System.out.println(sp);break;
		}
		System.out.print("是否继续（y/n）：");
		s = in.next();
		}while(s.equals("y"));
		System.out.println("\n折扣：0.8");
		System.out.println("应付金额："+sum*0.8);
		System.out.print("实付金额：");
		int money = in.nextInt();
		System.out.println("找钱："+(money-sum*0.8));
	}
}
