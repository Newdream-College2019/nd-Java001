import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入购买T恤的数量");
		double tnum=in.nextInt();
		System.out.println("请输入购买网球鞋的数量");
		double snum=in.nextInt();
		System.out.println("请输入购买网球拍的数量");
		
		double rnum=in.nextInt();
		double tshirt=245;
		double shose=570;
		double racket=320;
		
		double ttotal=tshirt*tnum;
		double stotal=shose*snum;
		double rtotal=racket*rnum;

		double total=ttotal+stotal+rtotal;
		double discount=total*0.8;
		int grade=(int)total/100*3;
		
		System.out.println("****************************消费单***************************");
		System.out.println("购买物品    单价    个数    金额");
		System.out.println("T恤\t"+tshirt+"\t"+tmun+"\t"ttotal);
		System.out.println("网球鞋\t"+shose+"\t"+smun+"\t"stotal);
		System.out.println("网球拍\t"+racket+"\t"+rmun+"\t"rtotal);
		System.out.println();
		System.out.println("折扣：8折");
		System.out.println("消费总金额"+total);
		System.out.println("折扣后金额"+discount);
		System.out.println("本次购物获得的积分"+grade);
		
}
}