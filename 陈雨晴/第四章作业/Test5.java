import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		int j;
		int k;
		System.out.println("����������������");
			i=input.nextInt();
			j=input.nextInt();
			k=input.nextInt();
		if(i==j&&j==k){
			System.out.println("�����������");
		}else if((i+j+k)>1000){
			System.out.println("��������֮�ʹ���1000");
		}else
			System.out.println("��������֮�Ͳ�����1000");}
}