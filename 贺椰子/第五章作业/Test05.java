import java.util.Scanner;
public class Test05{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("老师检查今天的学习任务是否合格？（yes/no）：");
		String result=in.next();
		while(result.equals("no")){
			System.out.println("继续学习：上午阅读教材，学习理论部分；下午上机编程，掌握代码部分。");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("老师检查今天的学习任务是否合格？（yes/no）：");
			result=in.next();
		}
		System.out.println("完成学习任务！");
	}
}
