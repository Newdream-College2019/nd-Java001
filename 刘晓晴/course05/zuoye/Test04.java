import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������ֽ�ʲô��");
		String answer=input.next();
		while("��������".equals(answer)){
			System.out.println("������ֽ�ʲô��");
			answer=input.next();
		}
		System.out.println("�������ԭ���У�"+answer);
	}
}