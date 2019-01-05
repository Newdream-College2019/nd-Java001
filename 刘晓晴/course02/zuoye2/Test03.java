import java.util.*;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一位四位的整数：");
		int num=input.nextInt();
		int one=num/1000;
		int two=num/100%10;
		int three=num/10%10;
		int four=num%10;
		System.out.println("千："+one+"\t百："+two+"\t十："+three+"\t个："+four);
	}
}