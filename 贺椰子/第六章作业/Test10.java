import java.util.Scanner;
public class Test10{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=3;
		do{
			System.out.print("请输入用户名：");
			String name = in.next();
			System.out.print("请输入密码：");
			String pass = in.next();
			if(name.equals("yeyeye")&&pass.equals("233")){
				System.out.println("欢迎登录MyShopping系统！");
				break;
			}else{
				System.out.println("输入错误，您还有"+(--i)+"次机会");
			}
		}while(i!=0);
		if(i==0){
			System.out.println("对不起，您3次均输入错误，请明天再来！");	
		}
	}
}
