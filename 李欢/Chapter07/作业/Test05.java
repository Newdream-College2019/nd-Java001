import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=input.nextInt();
		double num=0;
		if(n>0){
			for(double i=1;i<=n;i++){
				num+=1/i;
			}
			System.out.println("和为："+num);
		}else{
			System.out.println("输入错误");
		}

	}
}