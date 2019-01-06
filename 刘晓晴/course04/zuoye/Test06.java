import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入今天的年份：");
		int year=input.nextInt();
		System.out.print("请输入今天的月份：");
		int month=input.nextInt();
		System.out.print("请输入今天的日期：");
		int day=input.nextInt();
		if(((year%4==0)&&(year/100)!=0)||(year/400==0)){
			switch(month){
				case 1:
					day=day;
					System.out.println("总天数："+day);
					break;
				case 2:
					day=31+day;
					System.out.println("总天数："+day);
					break;
				case 3:
					day=31+29+day;
					System.out.println("总天数："+day);
					break;
				case 4:
					day=31+29+31+day;
					System.out.println("总天数："+day);
					break;
				case 5:
					day=31+29+31+30+day;
					System.out.println("总天数："+day);
					break;
				case 6:
					day=31+29+31+30+31+day;
					System.out.println("总天数："+day);
					break;
				case 7:
					day=31+29+31+30+31+30+day;
					System.out.println("总天数："+day);
					break;
				case 8:
					day=31+29+31+30+31+30+31+day;
					System.out.println("总天数："+day);
					break;
				case 9:
					day=31+29+31+30+31+30+31+31+day;
					System.out.println("总天数："+day);
					break;
				case 10:
					day=31+29+31+30+31+30+31+31+30+day;
					System.out.println("总天数："+day);
					break;
				case 11:
					day=31+29+31+30+31+30+31+31+30+31+day;
					System.out.println("总天数："+day);
					break;
				case 12:
					day=31+29+31+30+31+30+31+31+30+31+30+day;
					System.out.println("总天数："+day);
					break;
				default:
					System.out.println("输入错误");
					break;
			}
		}else{
			switch(month){
				case 1:
					day=day;
					System.out.println("总天数："+day);
					break;
				case 2:
					day=31+day;
					System.out.println("总天数："+day);
					break;
				case 3:
					day=31+28+day;
					System.out.println("总天数："+day);
					break;
				case 4:
					day=31+28+31+day;
					System.out.println("总天数："+day);
					break;
				case 5:
					day=31+28+31+30+day;
					System.out.println("总天数："+day);
					break;
				case 6:
					day=31+28+31+30+31+day;
					System.out.println("总天数："+day);
					break;
				case 7:
					day=31+28+31+30+31+30+day;
					System.out.println("总天数："+day);
					break;
				case 8:
					day=31+28+31+30+31+30+31+day;
					System.out.println("总天数："+day);
					break;
				case 9:
					day=31+28+31+30+31+30+31+31+day;
					System.out.println("总天数："+day);
					break;
				case 10:
					day=31+28+31+30+31+30+31+31+30+day;
					System.out.println("总天数："+day);
					break;
				case 11:
					day=31+28+31+30+31+30+31+31+30+31+day;
					System.out.println("总天数："+day);
					break;
				case 12:
					day=31+28+31+30+31+30+31+31+30+31+30+day;
					System.out.println("总天数："+day);
					break;
				default:
					System.out.println("输入错误");
					break;
			}
		
		}
	}
}