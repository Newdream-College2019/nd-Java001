import java.util.Scanner;
public class Test09{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ > �������\n");
		System.out.println("**********************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("**********************************************");
		String s;
		double sum=0;
		String sp="";
		do{
		System.out.print("��������Ʒ��ţ�");
		int n = in.nextInt();
		System.out.print("�����빺��������");
		int num = in.nextInt();
		switch(n){
			case 1:
				sum+=245.0*num;
				sp+="T��\t��245.0\t\t������"+num+"\t\t�ϼƣ�"+(245.0*num)+"\n";
				System.out.println(sp);break;
			case 2:
				sum+=334.0*num;
				sp+="����Ь\t��334.0\t\t������"+num+"\t\t�ϼƣ�"+(334.0*num)+"\n";
				System.out.println(sp);break;
			case 3:
				sum+=188.0*num;
				sp+="������\t��188.0\t\t������"+num+"\t\t�ϼƣ�"+(188.0*num)+"\n";
				System.out.println(sp);break;
		}
		System.out.print("�Ƿ������y/n����");
		s = in.next();
		}while(s.equals("y"));
		System.out.println("\n�ۿۣ�0.8");
		System.out.println("Ӧ����"+sum*0.8);
		System.out.print("ʵ����");
		int money = in.nextInt();
		System.out.println("��Ǯ��"+(money-sum*0.8));
	}
}
