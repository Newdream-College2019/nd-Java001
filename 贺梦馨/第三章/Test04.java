import java.util.Scanner;
public class Test04{
	public static void main(String[] args0{
		System.out.println("�㰮����");
		Scanner in=new Scanner(System.in);
		String answer=in.next();
		if(answer.equals("yes"){
			System.out.print("���ǰ��ҵ�");
		}else if(answer.equals("no")){
			System.out.print("ԭ���㲻����");
		}else{
			System.out.print("�����������Լ�Ҳ��֪��");
		}
	}
}