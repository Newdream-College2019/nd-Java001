import java.util.Scanner;
public class Test05{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean b=true;
		do{
			System.out.print("����һ��0~2֮���������");
			int i=in.nextInt();
			switch(i){
				case 0:
					System.out.println("�������ʯͷ");break;
				case 1:
					System.out.println("������Ǽ���");break;
				case 2:
					System.out.println("������ǲ�");break;
				default:
					b=false;break;
			}
		}while(b);
	}
}
