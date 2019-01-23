import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
			String answer;
		do{
			System.out.print("你的名字叫什么？");
			answer=in.next();
		}while(answer.equals("不告诉你"));
			System.out.print("原来你的名字叫"+answer);
	}
}