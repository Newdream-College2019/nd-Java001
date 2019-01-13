import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] arr=new double[5];
		double sum=0;
		System.out.println("请输入会员本月的消费记录");
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额:");
			arr[i]=input.nextDouble();
		}
		System.out.println("序号\t\t金额（元）");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t\t"+arr[i]);
			sum+=arr[i];
		}
		System.out.println("总金额：\t"+sum);
	}
}