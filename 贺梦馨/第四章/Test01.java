import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		System.out.println("******************************");
		System.out.println("  ��ӭʹ���������ع���ϵͳ��");
		System.out.println("1.��¼ϵͳ");
		System.out.println("");
		System.out.println("2.�˳�");
		System.out.println("******************************");
		System.out.println("��ѡ�����֣�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		switch(num){
			case 1:
			System.out.println("��ӭ�����¼ҳ��");
			break;
			case 2:
			System.out.println("��л����ʹ�ã�");
			break;
			default:
			System.out.println("��������������������֣�");
			break;
		}
	}
}
