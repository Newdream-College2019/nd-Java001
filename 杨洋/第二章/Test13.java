import java.util.Scanner;
public class Test13{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=input.nextInt();
		System.out.println("�������·ݣ�");
		int month=input.nextInt();
		int days=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			days=31;
		}
		System.out.println("������"+days);
	}
}