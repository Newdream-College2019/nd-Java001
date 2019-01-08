import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个操作数：");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("请输入运算符：");
		String s=input.next();
		switch(s){
			case "+":
				System.out.println("a+b运算结果："+(a+b));
				break;
			case "-":
				System.out.println("a-b运算结果："+(a-b));
				break;
			case "*":
				System.out.println("a*b运算结果："+(a*b));
				break;
			case "/":
				System.out.println("a/b运算结果："+(a/b));
				break;
			default :
				System.out.println("该运算方法不能实现");
		}
	}
}