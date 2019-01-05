import java.util.Scanner;
public class Pay
{
	public static void main(String[] args) 
	{
		double cost=1500;
		double t=245;
		double shoe=570;
		double pai=320;
		int jifen;
		double s;
		System.out.println("****************消费单*****************");
		System.out.println("购买物品\t单价\t 个数\t金额");
		System.out.println("T恤\t\t￥"+t+"\t   2\t￥"+t*2+"\n网球鞋\t\t￥"+shoe+"\t   1\t￥"+shoe*1+"\n网球拍\t\t￥"+pai+"\t   1\t￥"+pai*1+"\n");
		System.out.println("折扣：\t\t8折");
		s=(t*2+shoe+pai)*0.8;
		jifen=(int)s/100*3;
		System.out.println("消费总金额\t￥"+s);
		System.out.println("实际交费\t￥"+cost);
		System.out.println("找钱\t\t￥"+(cost-s));
		System.out.println("本次购物的所获积分是："+jifen);
	}
}
