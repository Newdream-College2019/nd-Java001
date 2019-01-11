import java.util.Scanner;
public class One{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num1=0,num2=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			int age=input.nextInt();
			if(age>=30){
				num1++;
			}else{
				num2++;
			}
		}
		System.out.println("30岁以上的比例是："+num1/10.0*100+"%");
		System.out.println("30岁以下的比例是："+num2/10.0*100+"%");
	}
}