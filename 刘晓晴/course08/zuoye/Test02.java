import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"λͬѧ�ĳɼ���");
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			count++;
		}
		System.out.println("��"+count+"λͬѧ�ɼ�����80��");
	}
}