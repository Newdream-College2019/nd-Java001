import java.util.Scanner;
public class AddCust
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ > �ͻ���Ϣ����\n");
		System.out.print("�������Ա��(<4λ����>):");
		int num = in.nextInt();
		if(!(num/1000>0&&num/1000<10)){
			System.out.print("����Ļ�Ա�Ų��Ϸ���");
		}else{
		System.out.print("�������Ա����(��/��<����λ����ʾ>):");
		String birth = in.next();
		System.out.print("��������֣�");
		int jifen = in.nextInt();
		System.out.println("\n��¼��Ļ�Ա��Ϣ�ǣ�\n"+num+"\t"+birth+"\t"+jifen);
			}
	}
}
