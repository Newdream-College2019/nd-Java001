import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ӵ�������:");
		int num=input.nextInt();
		switch(num){
			case 0:
			case 1:
			case 2:
				System.out.println("һ������"+num+"����");
				break;
			case 3:
			case 4:
			case 5:
				num++;
				System.out.println("һ������"+num+"����");
				break;
			default:
				num=num+2;
				System.out.println("һ������"+num+"����");
		}
	}

}