import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		int sum=0;
		Scanner in=new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
			System.out.print("�������"+(i+1)+"������");
			int a=in.nextInt();
			arr[i] =a;
			if(a==1||a==2||a==3){
				sum++;
			}
		}
		System.out.print("������Ϸ���"+sum+"��"+"�Ƿ���"+(10-sum)+"��");
		
	}
}