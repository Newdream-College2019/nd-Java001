import java.util.Scanner;
public class Test03 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("正确的密码是：");
		String pass=in.next();
		System.out.print("请输入第一次密码：");
		String one=in.next();
		if(pass.length()>=6){
			if(one.equals(pass)){
				System.out.print("请输入第二次密码：");
				String two=in.next();
				if(two.equals(pass)){
					System.out.println("恭喜拿到钱了！！！");
				}else{
					System.out.println("第二次密码错误！！");
				}
			}else{
				System.out.println("第一次密码错误！！");
			}
		}else{
			System.out.println("g密码长度要大于六位！！！");
		}
	}
}
