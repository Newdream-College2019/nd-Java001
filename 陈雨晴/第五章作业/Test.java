import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String answer="y";
		int num;
		int count;
		double sum=0;
		System.out.println("MyShopping����ϵͳ > �������");
		System.out.println("\n******************************************");
		while("y".equals(answer)||"Y".equals(answer)){
			System.out.println("��ѡ�������Ʒ��ţ�");
			System.out.println("1.T��\t2.����Ь\t3.������");
			System.out.println("*****************************************");
			System.out.print("��������Ʒ���:");
			count=input.nextInt();
			System.out.print("��������Ʒ����:");
			num=input.nextInt();
			switch(count){
				case 1:
					sum=sum+num*245.0;
					System.out.println("T ����245.0\t\t"+"����"+num+"\t�ϼƣ�"+sum);
					break;
				case 2:
					sum=sum+num*300.0;
					System.out.println("����Ь��300.0\t"+"����"+num+"\t�ϼƣ�"+sum);
					break;
				case 3:
					sum=sum+num*600.0;
					System.out.println("�����ģ�600.0\t"+"����"+num+"\t�ϼƣ�"+sum);
					break;
				default:
					System.out.println("�����������������");
			}
			System.out.print("�Ƿ����(y/n):");
			answer=input.next();
		}
		System.out.print("�ۿۣ�");
		double sal=1;
		if(sum>600){
			sal=0.8;
			System.out.println(sal);
		}else{
			System.out.println(sal);
		}
		double pay=sum*sal;
		System.out.println("Ӧ�����:"+pay);
		System.out.print("ʵ�����:");
		double money=input.nextInt();
		System.out.println("��Ǯ��"+(money-pay)+"\n\n\n\n\n");
		System.out.println("��ӭʹ��MyShopping����ϵͳ\n");
		System.out.println("************************************");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.println("\t\t3.�������");
		System.out.println("\t\t4.ע��");
		System.out.println("************************************\n");
		System.out.print("��ѡ����������:");
		int i=input.nextInt();
		do{			
			switch(i){
				case 1:
					System.out.println("ִ�пͻ���Ϣ����");
					break;
				case 2:
					System.out.println("ִ�й������");
					break;
				case 3:
					System.out.println("ִ���������");
					break;
				case 4:
					System.out.println("ִ��ע��");
					break;
				default:
					System.out.print("���������������������:");
					i=input.nextInt();
			}
		}while(i>4||i<1);
		System.out.println("\n�������");
	}
}