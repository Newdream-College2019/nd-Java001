import java.util.Scanner;
public class Test10{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=3;
		do{
			System.out.print("�������û�����");
			String name = in.next();
			System.out.print("���������룺");
			String pass = in.next();
			if(name.equals("yeyeye")&&pass.equals("233")){
				System.out.println("��ӭ��¼MyShoppingϵͳ��");
				break;
			}else{
				System.out.println("�������������"+(--i)+"�λ���");
			}
		}while(i!=0);
		if(i==0){
			System.out.println("�Բ�����3�ξ��������������������");	
		}
	}
}
