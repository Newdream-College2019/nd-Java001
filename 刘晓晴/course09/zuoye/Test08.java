import java.util.*;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[] songs=new String[5];
		songs[0]="Island";
		songs[1]="Ocean";
		songs[2]="Pretty";
		songs[3]="Sun";
		System.out.print("����ǰ������Ϊ��");
		for(int i=0;i<songs.length-1;i++){
			System.out.print(songs[i]+"  ");
		}
		System.out.print("\n������������ƣ�");
		String song=input.next();
		char s=song.charAt(0);
		char temp=0;
		int index=songs.length-1;
		for(int i=0;i<songs.length;i++){
			temp=songs[i].charAt(0);
			if(s<temp){
				index=i;
				break;
			}
		}
		//�ƶ�Ԫ��
		for(int i=songs.length-2;i>=index;i--){
			songs[i+1]=songs[i];
		}
		//��������
		songs[index]=song;
		System.out.print("�����ַ�����ַ����У�");
		for(int i=0;i<songs.length;i++){
			System.out.print(songs[i]+" ");
		}
	}
}