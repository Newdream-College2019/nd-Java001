import java.util.Scanner;
public class one{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统》购物结算");
		System.out.println("*************************************");
		System.out.println();
		System.out.println();
		String check="y";
		double discount=0.8;
		int money=0;
		while(check.equals("y")){
			System.out.println("请选择购买的上商品编号：");
			System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
			System.out.println("*************************************");
			System.out.println();
			System.out.println();
			System.out.print("请输入商品编号：");
			int num=input.nextInt();
			System.out.print("请输入购买数量：");
			int sum=input.nextInt();
			switch(num){
				case 1:{
					System.out.println("T恤\t￥245.0");
					System.out.println("数量\t"+sum);
					System.out.println("合计：\t￥"+245*sum);
					System.out.print("是否继续（y/n）:");
					money+=245*sum;
					check=input.next();
				}
					break;
				case 2:{
					System.out.println("网球鞋\t￥570.0");
					System.out.println("数量\t"+sum);
					System.out.println("合计：\t￥"+570*sum);
					System.out.print("是否继续（y/n）:");
					money+=570*sum;
					check=input.next();
				}
					break;
				case 3:{
					System.out.println("网球拍\t￥320.0");
					System.out.println("数量\t"+sum);
					System.out.println("合计：\t￥"+320*sum);
					System.out.print("是否继续（y/n）:");
					money+=320*sum;
					check=input.next();
				}
					break;
			}
		}
		System.out.println();
			System.out.println();
			System.out.println("折扣："+discount);
			System.out.println("应付金额："+money*discount);
			System.out.print("实付金额：");
			int total=input.nextInt();
			System.out.println("找钱："+(total-money*discount));
	}
}