import java.util.Scanner;
public class Test05{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("��������������");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a==b&&a==c&&b==c){
			System.out.println("�����������");
			if(a+b+c>1000){
				System.out.println("��������֮�ʹ���1000");
			}else{
				System.out.println("��������֮�Ͳ�����1000");
			}
		}
	}
}
