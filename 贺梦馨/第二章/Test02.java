import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		System.out.println("������һ�����");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		if((num%4==0&&num%400!=0)||num%100==0){
		System.out.println("�����������");
		}else
		{System.out.println("�������ƽ��");}

}
}