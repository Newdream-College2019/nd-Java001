import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����뺫�̱��μ������̴��������Σ�");
		int num=input.nextInt();
		switch(num){
			case 1:
				System.out.println("�ɲμ���ʡ����ѧ��֯��1��������Ӫ");
				break;
			case 2:
				System.out.println("�������ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("�����ƶ�Ӳ��һ��");
				break;
			default:
				System.out.println("�����κν���");
		}
	}
}