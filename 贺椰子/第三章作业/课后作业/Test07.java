import java.util.Scanner;
import java.util.Random;
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random re = new Random();
		System.out.println("�������ع������ϵͳ > ���˳齱\n");
		System.out.print("��������λ��Ա�ţ�");
		int num = in.nextInt();
		int suiji = re.nextInt(11);
		if(num/100%10==suiji){
			System.out.println(num+"�������û�����þ���MP3һ����");
		}else{
			System.out.println(num+"�ſͻ���лл����֧�֣�");
			}
	}
}
