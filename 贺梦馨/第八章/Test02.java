import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ�");
			int score=in.nextInt();
			if(score<=80){
				continue;
			}
			sum++;
			
		}
		System.out.print("����"+sum+"��ͬѧ�ɼ�����80��");
	}
}