import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"个学生的成绩");
			int score=in.nextInt();
			if(score<=80){
				continue;
			}
			sum++;
			
		}
		System.out.print("共有"+sum+"个同学成绩高于80分");
	}
}