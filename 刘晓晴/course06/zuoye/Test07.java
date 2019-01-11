import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=0;
		int sum=0;
		while(true){
			System.out.print("请输入大于0的数：");
			a=input.nextInt();
			sum+=a;
			if(a==0){
				break;
			}
		}
		System.out.println("sum:"+sum);
	}
}