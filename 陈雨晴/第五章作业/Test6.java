import java.util.Scanner;
import java.util.Random;
public class Test6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int i,j;		
		String answer="Y";
		while("Y".equals(answer)){
			System.out.println("�˻���ȭ��Ϸ");
			System.out.println("�����ȭ");
			i=input.nextInt();
			System.out.println("�������ȭ");
			j=rd.nextInt(3)+0;
			switch(i){
				case 0:
					System.out.println("�˳�����ʯͷ");
							switch(j){
				                        case 0:
											System.out.println("���Գ�����ʯͷ");
											break;
										case 1:
											System.out.println("���Գ����Ǽ���");
											System.out.println("��ʤ");
											break;
										case 2:
											System.out.println("���Գ����ǲ�");
										    System.out.println("����ʤ");
											break;
										default:
											System.out.println("������");
										}
					break;
				case 1:
					System.out.println("�˳����Ǽ���");
											switch(j){
				                        case 0:
											System.out.println("���Գ�����ʯͷ");
											System.out.println("����ʤ");
											break;
										case 1:
											System.out.println("���Գ����Ǽ���");
											break;
										case 2:
											System.out.println("���Գ����ǲ�");
										    System.out.println("��ʤ");
											break;
										default:
											System.out.println("������");
										}
					break;
				case 2:
					System.out.println("�˳����ǲ�");
											switch(j){
				                        case 0:
											System.out.println("���Գ�����ʯͷ");
											System.out.println("��ʤ");
											break;
										case 1:
											System.out.println("���Գ����Ǽ���");
											System.out.println("����ʤ");
											break;
										case 2:
											System.out.println("���Գ����ǲ�");
										    
											break;
										default:
											System.out.println("������");									
										}
				
					break;
				default:
					System.out.println("������");
			}
			
			if(i==j){
				System.out.println("ƽ��");
			}
			System.out.print("�Ƿ������Ϸ��(Y/N)");
			answer=input.next();
		}
		System.out.println("��Ϸ����");
	}
}