import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������Ҫ��������ĵ�һ������");
		double a=in.nextDouble();
		System.out.println("������Ҫ��������ĵڶ�������");
		double b=in.nextDouble();
		System.out.println("������Ҫ��������:(���� �Ӽ��˳�)");
		String c=in.next();
		switch(c){
			case "��":
			System.out.println(a+"��"+b+"����"+(a+b));
			break;
			case "��":
			System.out.println(a+"��"+b+"����"+(a-b));
			break;
			case "��":
			System.out.println(a+"��"+b+"����"+(a*b));
			break;
			case "��":
			System.out.println(a+"��"+b+"����"+(a/b));
			break;
			
		}
	}
}