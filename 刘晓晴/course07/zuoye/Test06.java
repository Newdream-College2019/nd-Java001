import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int n=input.nextInt();
		int js=0;
		int os=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				os++;	
			}else{
				js++;
			}
		}
		System.out.println("�����У�"+js+"\tż���У�"+os);
	}
}