import java.util.Scanner;
public class Test07{
	public static void main(String[] args) 
	{22+23+23+22=90
		Scanner in=new Scanner(System.in);
		System.out.print("输入两个操作数：");
		double a=in.nextDouble();
		double b=in.nextDouble();
		System.out.print("输入运算符（+  -  *  /）：");
		String s=in.next();
		switch(s){
			case "+":
				System.out.println(a+"+"+b+"="+(a+b));break;
			case "-":
				System.out.println(a+"-"+b+"="+(a-b));break;
			case "*":
				System.out.println(a+"*"+b+"="+(a*b));break;
			case "/":
				System.out.println(a+"/"+b+"="+(a/b));break;
			default:
				System.out.println("运算符输入不合法！");
		}
	}
}
