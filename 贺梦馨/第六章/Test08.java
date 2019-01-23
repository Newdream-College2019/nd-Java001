import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"个学生的成绩");
			int j=in.nextInt();
			if(j>80){
				sum++;
			}
			continue;
		}
		System.out.print("成绩超过85的有"+sum+"人");
	}
}