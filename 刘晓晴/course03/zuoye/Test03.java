import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String password="1234567";
		System.out.print("请输入第一道密码：");
		String one=input.next();
		if(one.length()<6){
			System.out.println("密码长度不能低于6位");
		}else{
			if(one.equals(password)){
				System.out.print("请输入第二道密码：");
				String two=input.next();
				if(two.equals(password)){
					System.out.println("恭喜拿到钱了");
				}else{
					System.out.println("第二道 密码输入错误");
				}
			}else{
				System.out.println("第一道密码输入错误");
			}
		}		
	}

}