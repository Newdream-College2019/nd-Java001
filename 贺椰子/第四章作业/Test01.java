import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�\n");
		System.out.println("**************************************************");
		System.out.print("��ѡ���������֣�");
		int n = in.nextInt();
		switch(n){
			case 1:
				System.out.println("��¼�ɹ���");
				break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default:
				System.out.println("�������");
		}
	}
}
