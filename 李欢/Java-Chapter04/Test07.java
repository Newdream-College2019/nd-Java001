import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������������");
		double a=input.nextDouble();
		double b=input.nextDouble();
		System.out.print("�������������");
		String cal=input.next();
		switch(cal){
			case "+":
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case "-":
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case "*":
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case "/":
				System.out.println(a+"/"+b+"="+(a/b));
				break;
		}

	}
}