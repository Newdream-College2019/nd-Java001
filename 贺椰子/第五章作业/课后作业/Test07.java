import java.util.Scanner;
public class Test07{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("输入两个正整数：");
		int a=in.nextInt();
		int b=in.nextInt();
		boolean n=true;
		for(int i=1;i<=a*b&&n;i++){
			if(i%b==0&&i%a==0){
				n=false;
			}
		}
	}
}
