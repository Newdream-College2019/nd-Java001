import java.util.Scanner;
public class Test17{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�㰮����");
		String a=input.next();
		if(a.equals("yes")){
			System.out.println("���ǰ��ҵ�");
		}
		else if(a.equals("no")){
			System.out.println("ԭ���㲻����");
		}
		else{
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
	}
}