import java.util.Scanner;
public class Test2
{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("�����������������");
		int num=input.nextInt();
		switch(num){
			case 1:
			case 2:
				System.out.println("����"+num+"����");
				break;
			case 3:
			case 4:
			case 5:
				num+=1;
				System.out.println("����"+num+"����");
				break;
			default :
				num+=2;
				System.out.println("����"+num+"����");
				break;
		}
	}
}