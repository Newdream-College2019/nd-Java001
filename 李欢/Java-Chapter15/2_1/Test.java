package chapter15;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String no;
		String brand = null;
		String type;
		int seatCount;
		int days=0;
		int rent=0;
		System.out.println("欢迎您来到汽车租赁公司！");
		Scanner input=new Scanner(System.in);
		System.out.print("请输入租车天数：");
		days=input.nextInt();
		System.out.print("请输入要租赁的汽车类型（1、轿车  2、客车）：");
		int choice=input.nextInt();
		Car car=new Car();
		Bus bus=new Bus();
		if(choice==1){
			System.out.print("请输入要租赁的汽车的品牌（1、宝马  2、别克）：");
			choice=input.nextInt();
			if(choice==1){
				System.out.print("1、550i");
				brand="宝马";
			}else{
				brand="别克";
				System.out.print("请输入轿车的型号：");
				System.out.print("2、商务舱GL8  3、林荫大道");
				choice=input.nextInt();
			}
			if (choice==1){
				type="550i";
			}else if(choice==2){
				type="商务舱GL8";
			}else{
				type="林荫大道";
			}
				no="京BK5543";
				System.out.println("\n分配给您的汽车牌号是："+no);
				car.setNo(no);
				car.setBrand(brand);
				car.setType(type);
				System.out.println("\n顾客您好！您需要支付的租赁费用是"+car.CalcRent(days));
		}else if(choice==2){
			System.out.print("请输入要租赁的客车类型（1、金杯  2、金龙）：");
			choice=input.nextInt();
			if(choice==1){
				brand="金杯";
				System.out.print("请输入客车的座位数：1、<=16座  2、>16座：");
			}else if (choice==2){
				brand="金龙";
				System.out.print("请输入客车的座位数：1、<=16座  2、>16座：");
			}
			int num=input.nextInt();
			if(num==1){
				seatCount=16;
			}else {
				seatCount=20;
			}
			no="京BK5543";
			System.out.println("分配给您的汽车牌号是："+no);
			bus.setNo(no);
			bus.setBrand(brand);
			bus.setSeatCount(seatCount);
			System.out.println("\n顾客您好！您需要支付的租赁费用是"+bus.CalcRent(days));
		}else{
			System.out.println("输入错误！");
		}

	}

}
