import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double num=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int age=input.nextInt();
			if(age>30){
				continue;
			}
			num++;
		}
		double rate=num/10*100;
		double rate2=100-rate;
		System.out.println("30�����µı����ǣ�"+rate+"%");
		System.out.println("30�����ϵı����ǣ�"+rate2+"%");
	}
}