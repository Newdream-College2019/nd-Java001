import java.util.Scanner;
public class Test07{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=0;
		for(int i=1;i<=5;i++){
			System.out.print("��"+i+"��ѧ���ɼ���");
			int score=in.nextInt();
			if(score<=80){
				continue;
			}
			num++;
		}
		System.out.println("��"+num+"��ͬѧ�ɼ�����80��");
	}
}
