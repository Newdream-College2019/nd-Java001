import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] arr=new double[5];
		double sum=0;
		System.out.println("�������Ա���µ����Ѽ�¼");
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ�����:");
			arr[i]=input.nextDouble();
		}
		System.out.println("���\t\t��Ԫ��");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t\t"+arr[i]);
			sum+=arr[i];
		}
		System.out.println("�ܽ�\t"+sum);
	}
}