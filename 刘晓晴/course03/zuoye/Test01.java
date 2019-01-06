import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int num=input.nextInt();
		int one=num/100;
		int two=num/10%10;
		int three=num%10;
		if(one>two&&two>three){
			System.out.println(num+"是降序数");
		}else{
			System.out.println(num+"不是降序数");
		}
	}
}