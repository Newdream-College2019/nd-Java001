import java.util.*;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入正方形的边长");
		int a=input.nextInt();
		int c=a*4;
		int s=a*a;
		System.out.println("边长："+a+"\t周长："+c+"\t面积："+s);
	}
}