import java.util.Scanner;
public class Test04{
	public static void main(String[] args){	
		Scanner in=new Scanner(System.in);
		int num;
		int zheng=0,fu=0;
		while(num!999){
			int num=in.nextInt();
			if(num>=0){
				zheng++;
			}else{
				fu++;
			}
		}
		System.out.print("一共输入了"+zheng+"个正数和"+fu+"个负数");
	}
}