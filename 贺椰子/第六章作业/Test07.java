import java.util.Scanner;
public class Test07{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=0;
		for(int i=1;i<=5;i++){
			System.out.print("第"+i+"名学生成绩：");
			int score=in.nextInt();
			if(score<=80){
				continue;
			}
			num++;
		}
		System.out.println("有"+num+"名同学成绩大于80分");
	}
}
