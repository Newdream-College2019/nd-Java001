import java.util.Scanner;
public class Test19{
	public static void main(String[] agrs){
		Scanner input=new Scanner(System.in);
		System.out.println("������һλ������");
		int a=input.nextInt();
		if(a%2==0){
			System.out.println("�������ż��");
		}
		else if(a%2==1){
			System.out.println("�����������");
		}
	}
}