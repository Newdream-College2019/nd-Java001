import java.util.Scanner;
public class Test06{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入一个数：");
		int num=in.nextInt();
		int a=1,b=1,c;
		for(int i=0;i<=num;i++){
			System.out.println(i+"+"+a+"="+(i+a));
			c=a+b;
			a=b;
			b=c;
		}

	}
}
