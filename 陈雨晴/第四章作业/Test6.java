import java.util.Date;
import java.util.Calendar;
public class Test6{
	public static void main(String[] args){
		int i=0;
		int sum=0;
	  Calendar calendar=Calendar.getInstance();
       //��õ�ǰʱ����·ݣ��·ݴ�0��ʼ���Խ��Ҫ��1
     int month=calendar.get(Calendar.MONTH)+1;
	 int day=calendar.get(Calendar.DATE);
	 int year=calendar.get(Calendar.YEAR);
	 System.out.println("��ǰ�·��ǣ�"+month);
	 System.out.println("��ǰ�����ǣ�"+day);
	  System.out.println("��ǰ����ǣ�"+year);
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
	 System.out.println("��1��1�ŵ����칲"+sum+"��");
	}
}