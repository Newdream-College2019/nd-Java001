import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		do{
			System.out.println("������һ��0~2��������");
			i=input.nextInt();
			switch(i){
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
					break;
			}
		}while(i>=0&&i<=2);
}
}