import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double num=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			int age=input.nextInt();
			if(age>30){
				continue;
			}
			num++;
		}
		double rate=num/10*100;
		double rate2=100-rate;
		System.out.println("30岁以下的比例是："+rate+"%");
		System.out.println("30岁以上的比例是："+rate2+"%");
	}
}