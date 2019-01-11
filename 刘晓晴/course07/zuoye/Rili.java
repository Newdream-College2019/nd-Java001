import java.util.Scanner;
public class Rili{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=input.nextInt();
		System.out.print("请输入月份：");
		int month=input.nextInt();
		int sum=0;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}
		int days=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else{
			days=31;
		}
		sum+=1;
		System.out.println(sum%7);
		System.out.println("\t\t"+year+"年"+month+"月的万年历\n\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.println();
			}
			sum++;
		}
	}

}