import java.util.Scanner;
public class Test07{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("����������������");
		int a=in.nextInt();
		int b=in.nextInt();
		int i;
		int m;
		for(i=a>b?a:b;i<a*b;i++){
			if(i%b==0&&i%a==0){
				break;
			}
		}
		System.out.println("��С��������"+i);
	}
}
