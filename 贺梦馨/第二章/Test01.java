import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		System.out.println("������һ����λ����");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int a=num%10;
		int b=num/10%10;
		int c=num/100;
		if(b>a&&c>b){
		System.out.println("���������һ��������");
		}else
		{System.out.println("�����������һ��������");}

}
}