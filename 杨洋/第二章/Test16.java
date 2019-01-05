import java.util.Scanner;
public class Test16{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一道密码：");
		int a=input.nextInt();
		if(a==123){
			System.out.println("请输入第二道密码：");
			int b=input.nextInt();
			if(b==456){
				System.out.println("恭喜拿到钱了");
			}else if(b!=456){
				System.out.println("第二道密码错误");
			}
		}else if(a!=123){
				System.out.println("第一道密码错误");
			}
	}
}