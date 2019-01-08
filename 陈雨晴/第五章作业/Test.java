import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String answer="y";
		int num;
		int count;
		double sum=0;
		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println("\n******************************************");
		while("y".equals(answer)||"Y".equals(answer)){
			System.out.println("请选择购买的商品编号：");
			System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
			System.out.println("*****************************************");
			System.out.print("请输入商品编号:");
			count=input.nextInt();
			System.out.print("请输入商品数量:");
			num=input.nextInt();
			switch(count){
				case 1:
					sum=sum+num*245.0;
					System.out.println("T 恤￥245.0\t\t"+"数量"+num+"\t合计￥"+sum);
					break;
				case 2:
					sum=sum+num*300.0;
					System.out.println("网球鞋￥300.0\t"+"数量"+num+"\t合计￥"+sum);
					break;
				case 3:
					sum=sum+num*600.0;
					System.out.println("网球拍￥600.0\t"+"数量"+num+"\t合计￥"+sum);
					break;
				default:
					System.out.println("输入错误，请重新输入");
			}
			System.out.print("是否继续(y/n):");
			answer=input.next();
		}
		System.out.print("折扣：");
		double sal=1;
		if(sum>600){
			sal=0.8;
			System.out.println(sal);
		}else{
			System.out.println(sal);
		}
		double pay=sum*sal;
		System.out.println("应付金额:"+pay);
		System.out.print("实付金额:");
		double money=input.nextInt();
		System.out.println("找钱："+(money-pay)+"\n\n\n\n\n");
		System.out.println("欢迎使用MyShopping管理系统\n");
		System.out.println("************************************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.购物结算");
		System.out.println("\t\t3.真情回馈");
		System.out.println("\t\t4.注销");
		System.out.println("************************************\n");
		System.out.print("请选择：输入数字:");
		int i=input.nextInt();
		do{			
			switch(i){
				case 1:
					System.out.println("执行客户信息管理");
					break;
				case 2:
					System.out.println("执行购物结算");
					break;
				case 3:
					System.out.println("执行真情回馈");
					break;
				case 4:
					System.out.println("执行注销");
					break;
				default:
					System.out.print("输入错误，请重新输入数字:");
					i=input.nextInt();
			}
		}while(i>4||i<1);
		System.out.println("\n程序结束");
	}
}