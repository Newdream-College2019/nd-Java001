import java.util.Scanner;
public class Test05{
	public static void main(String[] args){	
		Scanner in=new Scanner(System.in);
		int num;
		int sum=0;
		System.out.print("请输入一个数");
		int num=in.nextInt();
			if(num>0){
				for(int i=1;i<=num;i++){
					sum+=1/i;
				}
				System.out.print(sum);
			}else{
				System.out.print("输入错误！");
			}
		
		
	}
}