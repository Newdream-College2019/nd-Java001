import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		String answer;
		System.out.println("������ֽ�ʲô��");
		while(i==1){			
			answer=input.next();
			if(answer.equals("��������")){
				System.out.println("������ֽ�ʲô��");
			}else {
				System.out.println("�������ԭ���У�"+answer);
				break;
			}

		}		
	}
}