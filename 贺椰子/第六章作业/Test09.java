import java.util.Scanner;
public class Test09{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n");
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int num = in.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			String bir = in.next();
			System.out.print("�������Ա���֣�");
			int score = in.nextInt();
			if(num/1000>0&&num/1000<10){
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�\n"+num+"\t"+bir+"\t"+score);
			}else{
				System.out.println("¼��ʧ��");
			}
		}
	}
}
