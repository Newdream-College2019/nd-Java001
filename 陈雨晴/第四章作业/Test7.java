import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ������");
		int i=input.nextInt();
		System.out.print("������ڶ�������");
		int j=input.nextInt();
		System.out.println("����֮��Ϊ��"+(i+j));
		if(i>j){
			System.out.println("����֮��Ϊ��"+(i-j));
		}else{
			System.out.println("����֮��Ϊ��"+(j-i));
		}
		
		System.out.println("����֮��Ϊ��"+i*j);
		if(i>j){
			System.out.println("����֮��Ϊ��"+(i*1.0/j));
		}else{
			System.out.println("����֮��Ϊ��"+(j*1.0/i));
		}
	}
}