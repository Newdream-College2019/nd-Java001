import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		int realcode=1234;
		System.out.println("����������");
		Scanner in=new Scanner(System.in);
		int code=in.nextInt();
		if(code==realcode){
		System.out.println("���ٴ���������");
		Scanner in2=new Scanner(System.in);
		int code2=in2.nextInt();
			if(code2==realcode){
				System.out.println("��ϲ�õ�Ǯ����");
			}else{
				System.out.println("�������벻һ�£����������ɣ�");}

		}else{
			System.out.println("��һ�ξ�����˻�����Ǯ��");}

}
}