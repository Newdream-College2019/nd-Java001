import java.util.Scanner;
public class Test05{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("��ʦ�������ѧϰ�����Ƿ�ϸ񣿣�yes/no����");
		String result=in.next();
		while(result.equals("no")){
			System.out.println("����ѧϰ�������Ķ��̲ģ�ѧϰ���۲��֣������ϻ���̣����մ��벿�֡�");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("��ʦ�������ѧϰ�����Ƿ�ϸ񣿣�yes/no����");
			result=in.next();
		}
		System.out.println("���ѧϰ����");
	}
}
