import java.util.Scanner;
public class Test03 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("��ȷ�������ǣ�");
		String pass=in.next();
		System.out.print("�������һ�����룺");
		String one=in.next();
		if(pass.length()>=6){
			if(one.equals(pass)){
				System.out.print("������ڶ������룺");
				String two=in.next();
				if(two.equals(pass)){
					System.out.println("��ϲ�õ�Ǯ�ˣ�����");
				}else{
					System.out.println("�ڶ���������󣡣�");
				}
			}else{
				System.out.println("��һ��������󣡣�");
			}
		}else{
			System.out.println("g���볤��Ҫ������λ������");
		}
	}
}
