import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double number=in.nextDouble();
		int zs=(int)number;
		double xs=number-zs;
		System.out.println("��ֵ �������� С������");
		System.out.print(number+"\t"+zs+"\t"+xs);
}
}