import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入现在的月份");
		int month = input.nextInt();
		int date;
		switch(month){
			case 1:
			date=0;
			break;
			case 2:
			date=31;
			break;
			case 3:
			date=59;
			break;
			case 4:
			date=90;
			break;
			case 5:
			date=120;
			break;
			case 6:
			date=151;
			break;
			case 7:
			date=181;
			break;
			case 8:
			date=212;
			break;
			case 9:
			date=243;
			break;
			case 10:
			date=273;
			break;
			case 11:
			date=304;
			break;
			case 12:
			date=334;
			break;
			default:
			System.out.println("输入错误！");
			break;
			System.out.println("请输入今天的日期");
			int date2=input.nextInt();
			int total = date+date2;
			System.out.print(total);
		}
		
	}
}