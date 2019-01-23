import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		char[] arr={'a','c','u','b','e','p','f','z'};
		System.out.print("请输入一个字母");
		boolean result=false;
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);//从字符串中获取第i个字母
		//String a=in.next();
		for(int i=0;i<arr.length;i++){
			//String b=arr[i]+"";
			char b=arr[i];
			if(a==b){
				System.out.print("在数组中存在输入的字母，它的下标为"+i);
				result=true;
				break;
			}
			
		}
		if(!result){
		System.out.print("输入的字母不存在于数据中");
		}
	}
}