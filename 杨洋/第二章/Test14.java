import java.util.Scanner;
public class Test14{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������λ������");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a>b){
			if(b>c){
			}
		}
		if(a>c){
			if(b>c){	
			}
		}
		if(b>c){
			if(a>c){
				System.out.println("�ǽ�����");
			}
		}else{
			System.out.println("���ǽ�����");
		}
	}
}