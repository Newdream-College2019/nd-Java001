import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入今年年份：");
		int year=in.nextInt();
		System.out.print("今天是几月？：");
		int month=in.nextInt();
		System.out.print("今天是几号？：");
		int day=in.nextInt();
		int result=0;
		int i=1;
		while(i<month){
			
			if(i==4||i==6||i==9||i==11){
				result+=30;
			}else if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					result+=29;
				}else{
					result+=28;
				}
			}else{
				result+=31;
			}
			i++;
		}
		result+=day;
		System.out.println("今年1月1日到今天的总天数是"+result+"天");
	}
}