import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字（当输入999时结束输入）：");
		int num=input.nextInt();
		int zs=0,fs=0,zero=0;
		while(num!=999){
			num=input.nextInt();
			if(num>0){
				zs++;
			}else if(num<0){
				fs++;
			}else{
				zero++;
			}
		}
		System.out.println("正数有："+zs+"\t负数有："+fs+"\t零有："+zero);
	}
}