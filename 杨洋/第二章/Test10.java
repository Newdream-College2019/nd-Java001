import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入张浩的性别：");
		String sex=input.next();
		if(sex.equals("男")){
			System.out.println("张浩是男人");
		}
		if(sex.equals("女")){
			System.out.println("张浩是女人");
		}
	}
}