import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=3;
		do{
		System.out.print("�������û�����");
		String  name=input.next();
		System.out.print("���������룺");
		int password=input.nextInt();
		if(name.equals("jim")&&password==123456){
			System.out.println("��ӭ��½MyShoppingϵͳ��");
			break;
		}else{
			System.out.println("�������������"+(--i)+"�λ��ᣡ\n");
		}
		}while(i!=0);
		if(i==0){
			System.out.println("�Բ�����3�ξ��������");
		}
	}
}