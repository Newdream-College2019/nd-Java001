import java.util.*;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=0;
		while(i<=2){
			System.out.println("������һ�� 0 �� 2 ֮�������");
			int answer=input.nextInt();
			switch(answer){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
					System.out.println("������Ǽ���");
					break;
				case 2:
					System.out.println("������ǲ�");
					break;
				default:
					System.out.println("�������");
			}
			i++;

		}
	}
}