import java.util.Scanner;
public class Test01{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1.��¼ϵͳ");
		System.out.println("2.�˳�");
		System.out.println("*********************************");
		System.out.print("���������֣�");
		int one=input.nextInt();
		switch(one){
			case 1:{
				System.out.println("���˵����ڶ�������");
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				System.out.println("4.ע��");
				System.out.println("*********************************");
				System.out.print("���������֣�");
				int two=input.nextInt();
				switch (two){
					case 1:{
						System.out.println("�������ϵͳ���ͻ���Ϣ����");
						System.out.println("1.��ʾ���пͻ���Ϣ");
						System.out.println("2.��ӿͻ���Ϣ");
						System.out.println("3.�޸Ŀͻ���Ϣ");
						System.out.println("4.��ѯ�ͻ���Ϣ");
					}
						break;
					case 2:
						System.out.println("�������ϵͳ���������");
					case 3:{
						System.out.println("�������ϵͳ���������");
						System.out.println("1.���˴����");
						System.out.println("2.���˳齱");
						System.out.println("3.�����ʺ�");
					}
						break;
					case 4:
						System.out.println("лл����ʹ�ã�");
						break;
					default:
						System.out.println("�������");
						break;
				}
			}
				break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default :
				System.out.println("�������");
				break;

		}
	}
}
