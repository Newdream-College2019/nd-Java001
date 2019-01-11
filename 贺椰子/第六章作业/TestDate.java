import java.util.Scanner;
public class TestDate{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("输入年份：");
		int year=in.nextInt();
		System.out.print("输入月份：");
		int month=in.nextInt();
		int s=0;
		int day;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				s+=366;
			}else{
				s+=365;
			}
		}

		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					s+=29;
				}else{
					s+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				s+=30;
			}else{
				s+=31;
			}
		}

		if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){
					day=29;
				}else{
					day=28;
				}
			}else if(month==4||month==6||month==9||month==11){
				day=30;
			}else{
				day=31;
			}
		
		System.out.println("\t\t"+year+"年"+month+"月的日历：\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int n =(s+1)%7;
		for(int i=1;i<=n;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=day;i++){			
			System.out.print(i+"\t");
			if((s+i)%7==6){
				System.out.println();	
			}
			
		}
	}
}
