import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入今年年份：");
		int year=input.nextInt();
		System.out.print("请输入本月月份：");
		int month=input.nextInt();
		System.out.print("请输入今天几号：");
		int day=input.nextInt();
		int result=0;
		int i=1;
		while(i<month){
			if(i==4||i==6||i==9||i==11){
				result+=30;
			}else if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					result+=29;
				}else{
					result+=28;}
			}else{
				result+=31;}
			i++;
		}
		result+=day;
		System.out.println("今年 1 月 1 日到今天的总天数是"+result+"天");
		

	}
}