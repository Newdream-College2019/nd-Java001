import java.util.Scanner;
public class one{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ���������");
		System.out.println("*************************************");
		System.out.println();
		System.out.println();
		String check="y";
		double discount=0.8;
		int money=0;
		while(check.equals("y")){
			System.out.println("��ѡ���������Ʒ��ţ�");
			System.out.println("1.T��\t2.����Ь\t3.������");
			System.out.println("*************************************");
			System.out.println();
			System.out.println();
			System.out.print("��������Ʒ��ţ�");
			int num=input.nextInt();
			System.out.print("�����빺��������");
			int sum=input.nextInt();
			switch(num){
				case 1:{
					System.out.println("T��\t��245.0");
					System.out.println("����\t"+sum);
					System.out.println("�ϼƣ�\t��"+245*sum);
					System.out.print("�Ƿ������y/n��:");
					money+=245*sum;
					check=input.next();
				}
					break;
				case 2:{
					System.out.println("����Ь\t��570.0");
					System.out.println("����\t"+sum);
					System.out.println("�ϼƣ�\t��"+570*sum);
					System.out.print("�Ƿ������y/n��:");
					money+=570*sum;
					check=input.next();
				}
					break;
				case 3:{
					System.out.println("������\t��320.0");
					System.out.println("����\t"+sum);
					System.out.println("�ϼƣ�\t��"+320*sum);
					System.out.print("�Ƿ������y/n��:");
					money+=320*sum;
					check=input.next();
				}
					break;
			}
		}
		System.out.println();
			System.out.println();
			System.out.println("�ۿۣ�"+discount);
			System.out.println("Ӧ����"+money*discount);
			System.out.print("ʵ����");
			int total=input.nextInt();
			System.out.println("��Ǯ��"+(total-money*discount));
	}
}