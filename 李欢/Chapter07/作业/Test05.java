import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������");
		int n=input.nextInt();
		double num=0;
		if(n>0){
			for(double i=1;i<=n;i++){
				num+=1/i;
			}
			System.out.println("��Ϊ��"+num);
		}else{
			System.out.println("�������");
		}

	}
}