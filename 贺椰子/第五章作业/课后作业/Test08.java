import java.util.Scanner;
public class Test08{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		do{
			System.out.print("输入一个1~7的数：");
			n = in.nextInt();
			if(n==0){
				break;
				}
			switch(n){
				
				case 1:
					System.out.println("1:MON");break;
				case 2:
					System.out.println("2:TUE");break;
				case 3:
					System.out.println("3:WED");break;
				case 4:
					System.out.println("4:THU");break;
				case 5:
					System.out.println("5:FIR");break;
				case 6:
					System.out.println("6:SAT");break;
				case 7:
					System.out.println("7:SUN");break;
				default:
					System.out.println("输入错误请重新输入");

			}
		}while(n!=0);
	}
}
