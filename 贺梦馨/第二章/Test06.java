import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double number=in.nextDouble();
		int zs=(int)number;
		double xs=number-zs;
		System.out.println("数值 整数部分 小数部分");
		System.out.print(number+"\t"+zs+"\t"+xs);
}
}