import java.util.Scanner;
import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=5;
		do{
			System.out.println("������1��2��3�е�����һ����");
			num=in.nextInt();
			switch(num){
				case 1 :
				System.out.println("�������ȭͷ");
				break;
				case 2 :
				System.out.println("������Ǽ���");
				break;
				case 3 :
				System.out.println("������ǲ�");
				break;
				default:
				System.out.println("��Ϸ������");
			}
			Random r = new Random();
			int x=r.nextInt(3)+1;
			switch(x){
				case 1 :
				System.out.println("���Գ�����ȭͷ");
				break;
				case 2 :
				System.out.println("���Գ����Ǽ���");
				break;
				case 3 :
				System.out.println("���Գ����ǲ�");
				break;
				default:
				System.out.println("��Ϸ������");
				}
		
		}while(num==1||num==2||num==3);
		

		
	}
}