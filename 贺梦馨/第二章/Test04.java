import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		System.out.println("������Сʱ��");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int day=number/24;
		int hour=number%24;
		System.out.print("һ����"+day+"��"+hour+"Сʱ");
}
}