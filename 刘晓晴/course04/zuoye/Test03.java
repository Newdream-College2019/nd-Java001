import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入韩嫣的名次：");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("将参加麻省理工大学组织的1个月");
				break;
			case 2:
				System.out.println("将奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("将奖励移动硬盘一个");
				break;
			default :
				System.out.println("不给任何奖励");
				break;
		}
	}
}