import java.util.Scanner;
public class Test15{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=input.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
	}
}