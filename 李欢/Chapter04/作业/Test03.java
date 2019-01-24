import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入韩嫣本次计算机编程大赛的名次：");
		int num=input.nextInt();
		switch(num){
			case 1:
				System.out.println("可参加麻省理工大学组织的1个月夏令营");
				break;
			case 2:
				System.out.println("奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("奖励移动硬盘一个");
				break;
			default:
				System.out.println("不给任何奖励");
		}
	}
}