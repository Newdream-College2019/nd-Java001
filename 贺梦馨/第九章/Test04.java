import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[] arr = new double[5];
		for(int i=0;i<5;i++){
			System.out.print("�������"+i+"�ʹ�����");
			arr[i]=in.nextDouble();
		}
		for(int i=0;i<=4;i++){
			System.out.print(arr[i]);
		}
	}
}