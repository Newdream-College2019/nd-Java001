import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String password="1234567";
		System.out.print("�������һ�����룺");
		String one=input.next();
		if(one.length()<6){
			System.out.println("���볤�Ȳ��ܵ���6λ");
		}else{
			if(one.equals(password)){
				System.out.print("������ڶ������룺");
				String two=input.next();
				if(two.equals(password)){
					System.out.println("��ϲ�õ�Ǯ��");
				}else{
					System.out.println("�ڶ��� �����������");
				}
			}else{
				System.out.println("��һ�������������");
			}
		}		
	}

}