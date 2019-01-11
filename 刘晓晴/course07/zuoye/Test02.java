import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String check="true";
		String sum="";
		while(!check.equals("Esc")){
			System.out.print("ÇëÊäÈë×Ö·û´®£º");
			check=input.next();
			if(!check.equals("Esc")){
				sum=sum+check;
			}
		}
		System.out.println(sum);
	}
}