package chapter11;

import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
		String good;
		int price;
		Scanner input=new Scanner(System.in);
		public void initial(){
			Random ran=new Random();
			int num=ran.nextInt(3);
			if(num==1){
				good="公主电动车";
				price=2200;
			}else if(num==2){
				good="山地自行车";
				price=800;
			}else{
				good="摩托车";
				price=2200;
			}
		}
		public void guess(){
			System.out.print("请猜测“"+good+"”的价格：");
			int num=input.nextInt();
			for(int i=0;i<4;i++){
				if(price==num){
					System.out.println("猜对了！");
					break;
				}else if(price>num){
					System.out.println("再大点！");
					System.out.print("\n再猜一次吧：");
					num=input.nextInt();
					if(i==2){
						System.out.println("\n4次内没有猜对，下次努力吧！");
						break;
					}
				}else{
					System.out.println("再小点！");
					System.out.print("\n再猜一次吧：");
					num=input.nextInt();
					if(i==2){
						System.out.println("\n4次内没有猜对，下次努力吧！");
						break;
					}
				}
			}
		}
}
