import java.util.Scanner;
public class Two{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ���ͻ���Ϣ������ӿͻ���Ϣ");
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int num=input.nextInt();
			System.out.print("��ѡ���Ա���գ���/��<����λ������ʾ>����");
			String date=input.next();
			System.out.print("�������Ա���֣�");
			int sum=input.nextInt();
			if(num/1000>0&&num/1000<10){
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(num+"\t"+date+"\t"+sum);
				System.out.println();
			}else{
				System.out.println("¼��ʧ��");
				break;
			}
		}
		System.out.println();
		System.out.println("�������");
	}
}