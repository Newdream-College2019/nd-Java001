import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		System.out.println("请输入正方形的边长");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int longth=number*4;
		int area=number*number;
		System.out.print("长方形的周长是"+longth+"面积是"+area);
}
}