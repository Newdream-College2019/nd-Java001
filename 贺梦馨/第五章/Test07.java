import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num;
		do{
		System.out.println("������1~7�е���������");
		num=in.nextInt();
			switch(num){
				case 0:
				break;
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
				default:
				System.out.println("����������������룡");
				break;
			}
		}while(num!=0);
		System.out.print("��Ϸ���˳���");
	}
}