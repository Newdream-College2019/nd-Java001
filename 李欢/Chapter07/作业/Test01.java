import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������(0~10)��");
		int num=input.nextInt();
		int count=1;
		if(num>=1&&num<10){
			System.out.print(num+"!"+"=");
			for(int i=num;i>=1;i--){
				count=count*i;
				if(i<num){
				System.out.print("*");
				}
				System.out.print(i);
			}
			System.out.print("="+count);
		}
		else{
				System.out.println("�������");
			}

	}
}