import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		int realcode=1234;
		System.out.println("请输入密码");
		Scanner in=new Scanner(System.in);
		int code=in.nextInt();
		if(code==realcode){
		System.out.println("请再次输入密码");
		Scanner in2=new Scanner(System.in);
		int code2=in2.nextInt();
			if(code2==realcode){
				System.out.println("恭喜拿到钱啦！");
			}else{
				System.out.println("两次输入不一致，重新来过吧！");}

		}else{
			System.out.println("第一次就输错了还想拿钱？");}

}
}