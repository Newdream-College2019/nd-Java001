import java.util.Scanner;
import java.util.Random;
public class Test20{
	public static void main(String[] args){
		Random rd=new Random();
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.println("������4λ��Ա�ţ�");
		int num = rd.nextInt(10);
		System.out.println(num);
		int a=input.nextInt();
		if((a%1000)/100==num){
			System.out.println(a+"�ſͻ������˿ͻ�����þ���MP3һ��");
		}
		else if(a%1000/100!=(num)){
			System.out.println(a+"�ſͻ���лл����֧��");
		}
	}
}