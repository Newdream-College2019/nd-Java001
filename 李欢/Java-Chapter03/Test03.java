import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String password="1234567";
		System.out.println("�������һ�����룺");
		String first=input.next();
		if(first.length()<6){
			System.out.println("���볤�Ȳ��ܵ���6λ");
		}else{
			if(first.equals(password)){
				System.out.println("������ڶ������룺");
				String second=input.next();
				if(second.length()<6){
				System.out.println("���볤�Ȳ��ܵ���6λ");
				}else{
					if(second.equals(password)){
						System.out.println("��ϲ�õ�Ǯ�ˣ���");
					}else{
						System.out.println("�ڶ����������");
					}
				}
			}else{
				System.out.println("��һ���������");
			}
		}	
		
	}
}