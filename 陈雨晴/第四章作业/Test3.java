import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		System.out.print("�����뺫�̵����Σ�");
		Scanner input=new Scanner(System.in);
		int mc=input.nextInt();
		switch(mc){
		 case 1:
			 System.out.println("�μ���ʡ����ѧһ���µ�����Ӫ");
		      break;
		 case 2:
			 System.out.println("�������ձʼǱ�����һ̨");
		     break;
		case 3:
			 System.out.println("�����ƶ�Ӳ��һ��");
		     break;
	    default:
		     System.out.println("û���κν���");
			 break;

		}
	}
}