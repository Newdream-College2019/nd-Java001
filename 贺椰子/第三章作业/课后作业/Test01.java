import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("����һ����λ����");
		int n=in.nextInt();
		int bai=n/100;
		int shi=n/10%10;
		int ge=n%10;

		if(bai>shi&&shi>ge){
			System.out.println(n+"��һ��������");
		}else{
			System.out.println(n+"����һ��������");
		}
	}
}