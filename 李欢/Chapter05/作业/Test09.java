import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ����MyShopping����ϵͳ\n");
		System.out.println("**************************************");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.println("\t\t3.�������");
		System.out.println("\t\t4.ע��");
		System.out.println("**************************************\n");
		boolean bl=true;
		System.out.print("��ѡ���������֣�");
		do{
			int num=input.nextInt();
			switch(num){
				case 1:
					System.out.println("ִ�пͻ���Ϣ����\n\n");
					bl=false;
					break;
				case 2:
					System.out.println("ִ�й������\n\n");
					bl=false;
					break;
				case 3:
					System.out.println("ִ���������\n\n");
					bl=false;
					break;
				case 4:
					System.out.println("ִ��ע��\n\n");
					bl=false;
					break;
				default:
					System.out.print("��������������������֣�");
			}
		}while(bl);
			System.out.println("�������");
		
	}
}