import java.util.Scanner;
public class two{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println();
		System.out.println("**************************************");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\t3.�������");
		System.out.println("\t4.ע��");
		System.out.println("**************************************");
		System.out.println();
		System.out.print("��ѡ����������֣�");
		int num=input.nextInt();
		String check="false";
		while(check.equals("false")){
			switch(num){
				case 1:{
					System.out.println("ִ�пͻ�����");
					check="true";
				}
					break;
				case 2:{
					System.out.println("ִ�й������");
					check="true";
				}
					break;
				case 3:{
					System.out.println("ִ���������");
					check="true";
				}
					break;
				case 4:{
					System.out.println("ִ��ע��");
					check="true";
				}
					break;
				default :{
					System.out.print("��������������������֣�");
					num=input.nextInt();
					check="false";
				}
					break;
			}
		}
		System.out.println();
		System.out.println("�������");
	}
}