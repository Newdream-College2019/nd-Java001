import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"名学生的成绩：");
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			num++;
		}
		System.out.println("一共有"+num+"人的成绩大于80分");
	}
}