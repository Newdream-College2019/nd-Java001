import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ�� 0 �� 2 ֮�������");
		int answer=input.nextInt();
		Random rm=new Random();
		int random=rm.nextInt(3);
		switch(answer){
			case 0:{
				System.out.println("�������ʯͷ");
				switch(random){
					case 0:{
						System.out.println("���Գ�����ʯͷ");
						System.out.println("ƽ��");
					}
						break;
					case 1:{
						System.out.println("���Գ����Ǽ���");
						System.out.println("��Ӯ��");
					}
						break;
					case 2:{
						System.out.println("���Գ����ǲ�");
						System.out.println("������");
					}
						break;
				}
			}
				break;
			case 1:{
				System.out.println("������Ǽ���");
				switch(random){
					case 0:{
						System.out.println("���Գ�����ʯͷ");
						System.out.println("ƽ��");
					}
						break;
					case 1:{
						System.out.println("���Գ����Ǽ���");
						System.out.println("��Ӯ��");
					}
						break;
					case 2:{
						System.out.println("���Գ����ǲ�");
						System.out.println("������");
					}
						break;
				}
			}
				break;
			case 2:{
				System.out.println("������ǲ�");
				switch(random){
					case 0:{
						System.out.println("���Գ�����ʯͷ");
						System.out.println("ƽ��");
					}
						break;
					case 1:{
						System.out.println("���Գ����Ǽ���");
						System.out.println("��Ӯ��");
					}
						break;
					case 2:{
						System.out.println("���Գ����ǲ�");
						System.out.println("������");
					}
						break;
				}
			}
				break;
			default:
				System.out.println("�������");
		}

		
	}
}