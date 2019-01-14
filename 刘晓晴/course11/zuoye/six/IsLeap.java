package course11;

public class IsLeap {
	int year;
	public String isLeap(){
		if(year%4==0&&year%100!=0||year%400==0){
			return year+"是闰年";
		}else{
			return year+"是平年";
		}
	}
}
