import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����źƵ��Ա�");
		String sex=input.next();
		if(sex.equals("��")){
			System.out.println("�ź�������");
		}
		if(sex.equals("Ů")){
			System.out.println("�ź���Ů��");
		}
	}
}