import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=input.nextInt();
		int ou=0;
		int ji=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				ou++;
			}else{
				ji++;
			}
		}
		System.out.println("1到"+n+"中有"+ji+"个奇数和"+ou+"个偶数");
	}
}