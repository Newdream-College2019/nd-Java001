import java.util.Scanner;
import java.util.Random;

public class Test06{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random re=new Random();
		System.out.println("欢迎来到石头剪刀布游戏，这里0代表石头，1代表剪刀，2代表布");
		String youxi;
		do{
			System.out.print("请先出拳：");
			int me=in.nextInt();
			switch(me){
				case 0:
					System.out.println("您出的是石头");break;
				case 1:
					System.out.println("您出的是剪刀");break;
				case 2:
					System.out.println("您出的是布");break;
			}
			int computer=re.nextInt(3);
			switch(computer){
				case 0:
					System.out.println("电脑出的是石头");break;
				case 1:
					System.out.println("电脑出的是剪刀");break;
				case 2:
					System.out.println("电脑出的是布");break;
			}
			if(me<computer){
				if(me==0&&computer==2){
					System.out.println("电脑赢了");
				}else{
					System.out.println("你赢了");
					}
			}else if(computer<me){
				if(computer==0&&me==2){
					System.out.println("你赢了");
				}else{
					System.out.println("电脑赢了");
				}
			}else{
				System.out.println("这局是平局");
				}
			System.out.print("是否继续游戏（y/n）：");
			youxi=in.next();
			
		}while(youxi.equals("y"));
	}
}
