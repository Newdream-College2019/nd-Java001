import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������������:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int sum=a+b+c;
		if(a==b&&b==c&&a==c){
			System.out.println("�����������");
			if(sum>1000){
				System.out.println("��������֮�ʹ��� 100");
			}
			else{
				System.out.println("��������֮�Ͳ����� 1000");
			}
		}
	}

}