import java.util.Date;
import java.util.Calendar;
public class Test6{
	public static void main(String[] args){
		int i=0;
		int sum=0;
	  Calendar calendar=Calendar.getInstance();
       //获得当前时间的月份，月份从0开始所以结果要加1
     int month=calendar.get(Calendar.MONTH)+1;
	 int day=calendar.get(Calendar.DATE);
	 int year=calendar.get(Calendar.YEAR);
	 System.out.println("当前月份是："+month);
	 System.out.println("当前天数是："+day);
	  System.out.println("当前年份是："+year);
	 switch(month-1){
		case 12:
			sum+=31;
		case 11:
			sum+=30;
		case 10:
			sum+=31;
		case 9:
			sum+=30;
		case 8:
			sum+=31;
		case 7:
			sum+=31;
		case 6:
			sum+=30;
		case 5:
			sum+=31;
		case 4:
			sum+=30;
		case 3:
			sum+=31;
		case 2:
			if(((year%4==0)&&year%100!=0)||(year%400==0)){
			sum+=29;
		}else sum+=28;
		case 1:
			sum+=31;
		default:
			sum+=day;
	 }
	 System.out.println("从1月1号到今天共"+sum+"天");
	}
}