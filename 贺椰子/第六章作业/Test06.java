import java.util.Scanner;
public class Test06{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,s=0;
		do{
			System.out.print("请输入要累加的数（0退出）：");
			i=in.nextInt();
			s+=i;
		}while(i!=0);
		System.out.println(s);
	}
}
