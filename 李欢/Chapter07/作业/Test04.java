import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num;
		int count1=0;
		int count2=0;
		int count3=0;
		do{
			System.out.print("请输入数字（999退出）：");
			num=input.nextInt();
			if(num>0){
				count1++;
			}else if(num==0){
				count2++;
			}else{
				count3++;
			}
		}while(num!=999);
		System.out.println("正数的个数："+count1);
		System.out.println("0的个数："+count2);
		System.out.println("负数的个数："+count3);

	}
}