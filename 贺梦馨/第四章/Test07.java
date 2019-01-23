import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入要进行运算的第一个数：");
		double a=in.nextDouble();
		System.out.println("请输入要进行运算的第二个数：");
		double b=in.nextDouble();
		System.out.println("请输入要进行运算:(汉字 加减乘除)");
		String c=in.next();
		switch(c){
			case "加":
			System.out.println(a+"加"+b+"等于"+(a+b));
			break;
			case "减":
			System.out.println(a+"减"+b+"等于"+(a-b));
			break;
			case "乘":
			System.out.println(a+"乘"+b+"等于"+(a*b));
			break;
			case "除":
			System.out.println(a+"除"+b+"等于"+(a/b));
			break;
			
		}
	}
}