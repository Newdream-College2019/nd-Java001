import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int i=input.nextInt();
		System.out.print("请输入第二个数：");
		int j=input.nextInt();
		System.out.println("两数之和为："+(i+j));
		if(i>j){
			System.out.println("两数之差为："+(i-j));
		}else{
			System.out.println("两数之差为："+(j-i));
		}
		
		System.out.println("两数之积为："+i*j);
		if(i>j){
			System.out.println("两数之商为："+(i*1.0/j));
		}else{
			System.out.println("两数之商为："+(j*1.0/i));
		}
	}
}