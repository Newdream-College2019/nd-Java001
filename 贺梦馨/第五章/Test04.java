import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
			String answer;
		do{
			System.out.print("������ֽ�ʲô��");
			answer=in.next();
		}while(answer.equals("��������"));
			System.out.print("ԭ��������ֽ�"+answer);
	}
}