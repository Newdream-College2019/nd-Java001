import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ���");
			int score=input.nextInt();
			if(score<80){
				continue;
			}else{
				num++;
			}
		}
		System.out.println((num/5.0)*100+"%��ѧ���ĳɼ�����80��");
	}
}