import java.util.Scanner;
import java.util.Arrays;
public class Test05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double sum=0.0;
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ�");
			int a=in.nextInt();
			arr[i]=a;
			sum+=a;
		}
		Arrays.sort(arr);
		System.out.print("��߷���"+arr[9]);
		System.out.print("��ͷ���"+arr[0]);
		System.out.print("ƽ������"+(sum/10));
	
	}
}