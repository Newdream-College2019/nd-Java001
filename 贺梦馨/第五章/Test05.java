import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=5;
		do{
			System.out.println("请输入1、2、3中的任意一个数");
			num=in.nextInt();
			switch(num){
				case 1 :
				System.out.println("你出的是拳头");
				break;
				case 2 :
				System.out.println("你出的是剪刀");
				break;
				case 3 :
				System.out.println("你出的是布");
				break;
				default:
				System.out.println("游戏结束！");
				}
		//int x=(int)Math.random(10);
		
		}while(num==1||num==2||num==3);
		

		
	}
}