import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		System.out.print("������һ��1~7������");
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
				default:System.out.println("������󣡣�����������");
			}
			System.out.print("������һ��1~7������");
			i=input.nextInt();
		}
		System.out.println("�������");
	}
}