import java.util.Scanner;
public class Test0{
	public static void main(String[] args){	
		Scanner in=new Scanner(System.in);
		int num;
		int sum=0;
		System.out.print("������һ����");
		int num=in.nextInt();
		for(int i=1;i<=num;i++){
			if(i%2==0){
				sum++;
			}
		}
		
		System.out.print("1��"+num+"����"+sum+"��ż��");
	}
}