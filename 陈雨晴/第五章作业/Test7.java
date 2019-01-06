import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		System.out.print("请输入一个1~7的数：");
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		while(i!=0){
			switch(i){
				case 1:
					System.out.println("MON");
					break;
				case 2:
					System.out.println("TUE");
					break;
				case 3:
					System.out.println("WED");
					break;
				case 4:
					System.out.println("THU");
					break;
				case 5:
					System.out.println("FRI");
					break;
				case 6:
					System.out.println("SAT");
					break;
				case 7:
					System.out.println("SUN");
					break;
				default:System.out.println("输入错误！！请重新输入");
			}
			System.out.print("请输入一个1~7的数：");
			i=input.nextInt();
		}
		System.out.println("输入完毕");
	}
}