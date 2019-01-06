import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		System.out.println("请输入小时数");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int day=number/24;
		int hour=number%24;
		System.out.print("一共有"+day+"天"+hour+"小时");
}
}