import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		int sum=0;
		int i;
		Scanner in=new Scanner(System.in);
		do{
			System.out.print("请输入一个整数");
			i=in.nextInt();
			sum+=i;
		}while(i!=0);
		System.out.print(sum);
	}
}