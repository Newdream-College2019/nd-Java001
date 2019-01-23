import java.util.Scanner;
import java.util.Arrays;
public class Test05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double sum=0.0;
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"个学生的成绩");
			int a=in.nextInt();
			arr[i]=a;
			sum+=a;
		}
		Arrays.sort(arr);
		System.out.print("最高分是"+arr[9]);
		System.out.print("最低分是"+arr[0]);
		System.out.print("平均分是"+(sum/10));
	
	}
}