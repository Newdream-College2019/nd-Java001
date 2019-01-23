import java.util.Scanner;
public class Test04{
	public static void main(String[] args0{
		System.out.println("你爱我吗？");
		Scanner in=new Scanner(System.in);
		String answer=in.next();
		if(answer.equals("yes"){
			System.out.print("你是爱我的");
		}else if(answer.equals("no")){
			System.out.print("原来你不爱我");
		}else{
			System.out.print("爱不爱我你自己也不知道");
		}
	}
}