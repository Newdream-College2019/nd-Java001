import java.util.Scanner;
public class Test1
{
   public static void main(String[] args){
	   Scanner input=new Scanner(System.in);
      System.out.println("\t��ӭʹ���������ع������ϵͳ");
	  System.out.println("\t\t1.��¼ϵͳ\n");
	  System.out.println("\t\t2.�˳�\n");
      System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
      System.out.print("��ѡ���������֣�");
	  int in=input.nextInt();
	  switch(in){
	    case 1:
			System.out.println("��ӭ��¼ϵͳ");
			break;
		case 2:
			System.out.println("лл����ʹ��");
			break;
		default:
			System.out.println("�������");
	  }
   }
}