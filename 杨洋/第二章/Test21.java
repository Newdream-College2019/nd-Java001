import java.util.Scanner;
public class Test21{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������Ա��(<��λ����>)��");
		int a,b,c;
		a=input.nextInt();
		if((a/1000)<1||(a/1000)>=10){
			System.out.print("���벻�Ϸ������������룺");
			a=input.nextInt();
			System.out.print("�������Ա����(��/��<����λ����ʾ>)��");
			b=input.nextInt();
		}else{
			System.out.print("�������Ա����(��/��<����λ����ʾ>)��");
			b=input.nextInt();
		}
		if((b/1000)<1||(b/1000)>=10){
			System.out.print("���벻�Ϸ������������룺");
			b=input.nextInt();
			System.out.print("��������֣�");
			c=input.nextInt();
		}else{
			System.out.print("��������֣�");
			c=input.nextInt();
		}
		System.out.println("\n");
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println(a+"\t"+b+"\t"+c);
	}
}