import java.util.Scanner;
public class Pay
{
	public static void main(String[] args) 
	{
		double cost=1500;
		double t=245;
		double shoe=570;
		double pai=320;
		int jifen;
		double s;
		System.out.println("****************���ѵ�*****************");
		System.out.println("������Ʒ\t����\t ����\t���");
		System.out.println("T��\t\t��"+t+"\t   2\t��"+t*2+"\n����Ь\t\t��"+shoe+"\t   1\t��"+shoe*1+"\n������\t\t��"+pai+"\t   1\t��"+pai*1+"\n");
		System.out.println("�ۿۣ�\t\t8��");
		s=(t*2+shoe+pai)*0.8;
		jifen=(int)s/100*3;
		System.out.println("�����ܽ��\t��"+s);
		System.out.println("ʵ�ʽ���\t��"+cost);
		System.out.println("��Ǯ\t\t��"+(cost-s));
		System.out.println("���ι������������ǣ�"+jifen);
	}
}
