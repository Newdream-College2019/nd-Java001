import java.util.Scanner;
public class Test16{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ�����룺");
		int a=input.nextInt();
		if(a==123){
			System.out.println("������ڶ������룺");
			int b=input.nextInt();
			if(b==456){
				System.out.println("��ϲ�õ�Ǯ��");
			}else if(b!=456){
				System.out.println("�ڶ����������");
			}
		}else if(a!=123){
				System.out.println("��һ���������");
			}
	}
}