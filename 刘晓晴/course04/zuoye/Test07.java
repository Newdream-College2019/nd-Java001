import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������������������");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("�������������");
		String s=input.next();
		switch(s){
			case "+":
				System.out.println("a+b��������"+(a+b));
				break;
			case "-":
				System.out.println("a-b��������"+(a-b));
				break;
			case "*":
				System.out.println("a*b��������"+(a*b));
				break;
			case "/":
				System.out.println("a/b��������"+(a/b));
				break;
			default :
				System.out.println("�����㷽������ʵ��");
		}
	}
}