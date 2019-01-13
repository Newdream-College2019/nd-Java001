import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"位同学的成绩：");
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			count++;
		}
		System.out.println("有"+count+"位同学成绩超过80分");
	}
}