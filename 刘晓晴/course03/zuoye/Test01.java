import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ����λ������");
		int num=input.nextInt();
		int one=num/100;
		int two=num/10%10;
		int three=num%10;
		if(one>two&&two>three){
			System.out.println(num+"�ǽ�����");
		}else{
			System.out.println(num+"���ǽ�����");
		}
	}
}