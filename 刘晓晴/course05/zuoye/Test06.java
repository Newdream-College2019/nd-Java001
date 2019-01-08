import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个 0 到 2 之间的整数");
		int answer=input.nextInt();
		Random rm=new Random();
		int random=rm.nextInt(3);
		switch(answer){
			case 0:{
				System.out.println("你出的是石头");
				switch(random){
					case 0:{
						System.out.println("电脑出的是石头");
						System.out.println("平局");
					}
						break;
					case 1:{
						System.out.println("电脑出的是剪刀");
						System.out.println("你赢了");
					}
						break;
					case 2:{
						System.out.println("电脑出的是布");
						System.out.println("你输了");
					}
						break;
				}
			}
				break;
			case 1:{
				System.out.println("你出的是剪刀");
				switch(random){
					case 0:{
						System.out.println("电脑出的是石头");
						System.out.println("平局");
					}
						break;
					case 1:{
						System.out.println("电脑出的是剪刀");
						System.out.println("你赢了");
					}
						break;
					case 2:{
						System.out.println("电脑出的是布");
						System.out.println("你输了");
					}
						break;
				}
			}
				break;
			case 2:{
				System.out.println("你出的是布");
				switch(random){
					case 0:{
						System.out.println("电脑出的是石头");
						System.out.println("平局");
					}
						break;
					case 1:{
						System.out.println("电脑出的是剪刀");
						System.out.println("你赢了");
					}
						break;
					case 2:{
						System.out.println("电脑出的是布");
						System.out.println("你输了");
					}
						break;
				}
			}
				break;
			default:
				System.out.println("输入错误");
		}

		
	}
}