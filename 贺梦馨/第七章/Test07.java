import java.util.Scanner;
public class Test07{
	public static void main(String[] args){	
		Scanner in=new Scanner(System.in);
		System.out.print("������һ�����");
		int year=in.nextInt();
		System.out.print("������һ���·�");
		int month=in.nextInt();
		int days=0,day=0;
		for(int i=1900;i<year;i++){
			if(year%4==0&&year%100!=0||year%400==0){
				days+=366;
			}else{
				days+=365;
			}
		}
		for(int i=1;i<month;i++){
			if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){
					days+=29;
					day=29;
				}else{	
					days+=27;
					day=27;
				}
			}else if(month==4||month==6||month==9||month==11){
				days+=30;
				day=30;
			}else{
				days+=31;
				day=31;
			}
		}
		System.out.print(month+"��һ��������"+(days%7));
		
		System.out.print("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<days%7;i++){
		System.out.print(" \t");
		}
		for(int i=1;i<day;i++){
		if(){
			System.out.println(i+"\t");
		}else{
		 System.out.print(i+"\t");
		}
		}
	}
}