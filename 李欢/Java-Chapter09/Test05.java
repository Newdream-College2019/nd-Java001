import java.util.*;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生的单科成绩：");
			a[i]=input.nextInt();
		}
		int num1=0;
		int num2=0;
		int num3=0;
		int sum=0;
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<60){
				num1++;
			}else if(a[i]>=80){
				num2++;
			}else{
				num3++;
			}
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
			sum+=a[i];
		}
		System.out.println("成绩在60分以下的有："+num1+"个");
		System.out.println("成绩在60~80分的有："+num2+"个");
		System.out.println("成绩在80分以上的有："+num3+"个");
		double avg=sum/a.length;
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);
		System.out.println("平均分："+avg);
	}
}
