import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������");
		int n=input.nextInt();
		double sum=0;
		if(n>0){
			for(int i=1;i<=n;i++){
				sum+=1.0/i;
			}
			System.out.println("��Ϊ��"+sum);
		}else{
			System.out.println("�������");
		}

		
	}
}