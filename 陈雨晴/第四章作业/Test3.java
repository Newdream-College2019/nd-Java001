import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		System.out.print("请输入韩嫣的名次：");
		Scanner input=new Scanner(System.in);
		int mc=input.nextInt();
		switch(mc){
		 case 1:
			 System.out.println("参加麻省理工大学一个月的夏令营");
		      break;
		 case 2:
			 System.out.println("奖励惠普笔记本电脑一台");
		     break;
		case 3:
			 System.out.println("奖励移动硬盘一个");
		     break;
	    default:
		     System.out.println("没有任何奖励");
			 break;

		}
	}
}