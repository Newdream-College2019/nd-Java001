import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		String sum="";
		String a;
		while(!a.equals("Esc")){
		System.out.print("ÇëÊäÈë×Ö·û´®");
		Scanner in=new Scanner(System.in);
		a=in.next();
		sum=sum+a;
		}
		System.out.print(sum);
		
	}
}