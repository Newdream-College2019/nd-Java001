import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
		System.out.print("请输入第"+i+"名学生的成绩：");
		int score=input.nextInt();
		if(score>80){
			count++;
			continue;
		}
		}
		System.out.println("一共有"+count+"人的成绩大于80分");
	}
}