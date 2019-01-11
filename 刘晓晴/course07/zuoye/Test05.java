import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=input.nextInt();
		double sum=0;
		if(n>0){
			for(int i=1;i<=n;i++){
				sum+=1.0/i;
			}
			System.out.println("和为："+sum);
		}else{
			System.out.println("输入错误");
		}

		
	}
}