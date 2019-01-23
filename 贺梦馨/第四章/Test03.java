import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		System.out.print("请输入韩嫣的名次");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch(num){
		case 1:
		System.out.print("奖励参加麻省理工组织的夏令营");
		break;
		case 2:
		System.out.print("奖励惠普笔记本一部");
		break;
		case 3:
		System.out.print("奖励移动硬盘一个");
		break;
		default:
		System.out.print("不获得任何奖励");
		break;
		}
	}
}