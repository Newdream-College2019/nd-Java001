import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�����뺫�̵����Σ�");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("���μ���ʡ����ѧ��֯��1����");
				break;
			case 2:
				System.out.println("���������ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("�������ƶ�Ӳ��һ��");
				break;
			default :
				System.out.println("�����κν���");
				break;
		}
	}
}