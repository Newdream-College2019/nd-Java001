import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�����빺��T��������");
		double tnum=in.nextInt();
		System.out.println("�����빺������Ь������");
		double snum=in.nextInt();
		System.out.println("�����빺�������ĵ�����");
		
		double rnum=in.nextInt();
		double tshirt=245;
		double shose=570;
		double racket=320;
		
		double ttotal=tshirt*tnum;
		double stotal=shose*snum;
		double rtotal=racket*rnum;

		double total=ttotal+stotal+rtotal;
		double discount=total*0.8;
		int grade=(int)total/100*3;
		
		System.out.println("****************************���ѵ�***************************");
		System.out.println("������Ʒ    ����    ����    ���");
		System.out.println("T��\t"+tshirt+"\t"+tmun+"\t"ttotal);
		System.out.println("����Ь\t"+shose+"\t"+smun+"\t"stotal);
		System.out.println("������\t"+racket+"\t"+rmun+"\t"rtotal);
		System.out.println();
		System.out.println("�ۿۣ�8��");
		System.out.println("�����ܽ��"+total);
		System.out.println("�ۿۺ���"+discount);
		System.out.println("���ι����õĻ���"+grade);
		
}
}