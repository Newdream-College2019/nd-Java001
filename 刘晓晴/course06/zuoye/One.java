import java.util.Scanner;
public class One{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num1=0,num2=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int age=input.nextInt();
			if(age>=30){
				num1++;
			}else{
				num2++;
			}
		}
		System.out.println("30�����ϵı����ǣ�"+num1/10.0*100+"%");
		System.out.println("30�����µı����ǣ�"+num2/10.0*100+"%");
	}
}