import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		System.out.println("请输入一个年份");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		if((num%4==0&&num%400!=0)||num%100==0){
		System.out.println("输入的是闰年");
		}else
		{System.out.println("输入的是平年");}

}
}