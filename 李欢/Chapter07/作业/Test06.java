import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������");
		int n=input.nextInt();
		int ou=0;
		int ji=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				ou++;
			}else{
				ji++;
			}
		}
		System.out.println("1��"+n+"����"+ji+"��������"+ou+"��ż��");
	}
}