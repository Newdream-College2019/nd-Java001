package course11;

import java.util.*;
public class GuessMachine {
	String good;
	int price;
	Scanner input=new Scanner(System.in);
	public void initial(){
		Random random=new Random();
		int num=random.nextInt(3);
		if(num==0){
			good="公主电动车";
			price=2800;
		}else if(num==1){
			good="山地自行车";
			price=1200;
		}else{
			good="摩托车";
			price=5500;
		}
	}
	public void guess(){
		int pr=0;
		System.out.print("请猜测\""+good+"\"的价格：");
		pr=input.nextInt();
		for(int i=0;i<4;i++){
			if(price==pr){
				System.out.println("恭喜你，竞猜成功！");
				break;
			}else if(pr>price){
				System.out.println("再小点！");
				System.out.print("\n再猜一次吧：");
				pr=input.nextInt();
				if(i==2){
					System.out.println("4次都没有猜对，下次努力吧！");
					break;
				}
			}else{
				System.out.println("再大点！");
				System.out.print("\n再猜一次吧：");
				pr=input.nextInt();
				if(i==2){
					System.out.println("4次都没有猜对，下次努力吧！");
					break;
				}
			}
		}
	}
}
