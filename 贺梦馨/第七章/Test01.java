import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		int sum=1;
		System.out.print("请输入一个数字");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		if(1<=num&&num<10){
			for(int i=1;i<=num;i++){
			sum=sum*i;
			}
		System.out.print(num+"的阶乘为"+sum);
		}else{
		System.out.print("输入错误，请重新输入！");
		}
	}
}