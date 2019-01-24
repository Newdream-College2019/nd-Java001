import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String password="1234567";
		System.out.println("请输入第一道密码：");
		String first=input.next();
		if(first.length()<6){
			System.out.println("密码长度不能低于6位");
		}else{
			if(first.equals(password)){
				System.out.println("请输入第二道密码：");
				String second=input.next();
				if(second.length()<6){
				System.out.println("密码长度不能低于6位");
				}else{
					if(second.equals(password)){
						System.out.println("恭喜拿到钱了！！");
					}else{
						System.out.println("第二道密码错误");
					}
				}
			}else{
				System.out.println("第一道密码错误");
			}
		}	
		
	}
}