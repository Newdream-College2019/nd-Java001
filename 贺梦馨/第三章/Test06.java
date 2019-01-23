import java.util.Scanner;
public class Test06{
	public shatic void main(String[] args){
		System.out.println("请输入一个值");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		if(a%2==0){
		System.out.println("输入的是偶数");
		}else{
		System.out.println("输入的不是偶数");
		}
	}
}