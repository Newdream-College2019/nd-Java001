import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		System.out.print("�����뺫�̵�����");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch(num){
		case 1:
		System.out.print("�����μ���ʡ����֯������Ӫ");
		break;
		case 2:
		System.out.print("�������ձʼǱ�һ��");
		break;
		case 3:
		System.out.print("�����ƶ�Ӳ��һ��");
		break;
		default:
		System.out.print("������κν���");
		break;
		}
	}
}