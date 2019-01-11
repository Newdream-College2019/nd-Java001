import java.util.Scanner;
public class Three{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name=input.next();
		System.out.print("请输入密码：");
		String password=input.next();
		if(name.equals("jim")&&password.equals("123456")){
			System.out.println("欢迎登录MyShopping系统");
		}else{
			for(int i=2;i>0;i--){
				System.out.print("输入错误!您还有"+i+"次机会！");
				System.out.println();
				System.out.print("请输入用户名：");
				name=input.next();
				System.out.print("请输入密码：");
				password=input.next();
				if(!name.equals("jim")&&!password.equals("123456")){
					if(i==1){
						System.out.println("对不起，您3次均输入错误！");
					}
					continue;
				}else{
					System.out.println("欢迎登录MyShopping系统");
					break;
				}
				
			}
		}
	}
}