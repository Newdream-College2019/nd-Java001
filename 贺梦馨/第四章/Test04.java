import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		System.out.print("������һ������");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
			case 1:
			System.out.print("����һ");
			break;
			case 2:
			System.out.print("���ڶ�");
			break;
			case 3:
			System.out.print("������");
			break;
			default:
			System.out.print("�������");

		}
	}
}