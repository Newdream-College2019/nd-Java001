import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] money=new double[5];
		double sum=0;
		System.out.println("请输入会员本月的消费记录");
		for(int i=0;i<money.length;i++){
		System.out.print("请输入第"+(i+1)+"笔购物金额：");
		money[i]=input.nextDouble();
		sum+=money[i];
		}
		System.out.println("\n序号\t\t\t金额（元）");
		System.out.println("1\t\t\t"+money[0]);
		System.out.println("2\t\t\t"+money[1]);
		System.out.println("3\t\t\t"+money[2]);
		System.out.println("4\t\t\t"+money[3]);
		System.out.println("5\t\t\t"+money[4]);
		System.out.println("总金额\t\t\t"+sum);
	}
}