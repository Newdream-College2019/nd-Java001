import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=3;
		do{
		System.out.print("请输入用户名：");
		String  name=input.next();
		System.out.print("请输入密码：");
		int password=input.nextInt();
		if(name.equals("jim")&&password==123456){
			System.out.println("欢迎登陆MyShopping系统！");
			break;
		}else{
			System.out.println("输入错误！您还有"+(--i)+"次机会！\n");
		}
		}while(i!=0);
		if(i==0){
			System.out.println("对不起，您3次均输入错误！");
		}
	}
}