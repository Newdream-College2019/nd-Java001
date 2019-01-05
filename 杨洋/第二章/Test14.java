import java.util.Scanner;
public class Test14{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三位整数：");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a>b){
			if(b>c){
			}
		}
		if(a>c){
			if(b>c){	
			}
		}
		if(b>c){
			if(a>c){
				System.out.println("是降序数");
			}
		}else{
			System.out.println("不是降序数");
		}
	}
}