import java.util.Scanner;
public class Test03{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("获得了第几名？：");
		int m = in.nextInt();
		switch(m){
			case 1:
				System.out.println("奖励参加麻省理工大学组织的1个月夏令营");
				break;
			case 2:
				System.out.println("奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("奖励移动硬盘一个");
				break;
			default:
				System.out.println("没有任何奖励");
		}
	}
}
