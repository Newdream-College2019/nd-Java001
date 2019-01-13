import java.util.*;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] scores=new double[10];
		for(int i=0;i<scores.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生的分数:");
			scores[i]=input.nextDouble();
		}
		int cs=0;
		int ls=0;
		int ys=0;
		double max=scores[0];
		double min=scores[0];
		double sum=0;
		for(int i=0;i<scores.length;i++){
			if(scores[i]<60){
				cs++;
			}else if(scores[i]>=80){
				ys++;
			}else{
				ls++;
			}
			if(scores[i]>max){
				max=scores[i];
			}
			if(scores[i]<min){
				min=scores[i];
			}
			sum+=scores[i];
		}
		System.out.println("成绩在60分以下有"+cs+"人");
		System.out.println("成绩在60~80有"+ls+"人");
		System.out.println("成绩在80分以上有"+ys+"人");
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);
		System.out.println("平均分："+(sum/scores.length));
	}
}