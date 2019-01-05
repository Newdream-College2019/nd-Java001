import java.util.*;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int day=a/24;
		int hour=a-day*24;
		System.out.println(day+"天零"+hour+"个小时");
	}
}