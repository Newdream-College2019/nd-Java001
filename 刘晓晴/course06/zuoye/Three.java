import java.util.Scanner;
public class Three{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������û�����");
		String name=input.next();
		System.out.print("���������룺");
		String password=input.next();
		if(name.equals("jim")&&password.equals("123456")){
			System.out.println("��ӭ��¼MyShoppingϵͳ");
		}else{
			for(int i=2;i>0;i--){
				System.out.print("�������!������"+i+"�λ��ᣡ");
				System.out.println();
				System.out.print("�������û�����");
				name=input.next();
				System.out.print("���������룺");
				password=input.next();
				if(!name.equals("jim")&&!password.equals("123456")){
					if(i==1){
						System.out.println("�Բ�����3�ξ��������");
					}
					continue;
				}else{
					System.out.println("��ӭ��¼MyShoppingϵͳ");
					break;
				}
				
			}
		}
	}
}