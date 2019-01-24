import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String zi="";
		String all="";
		do{
			all+=zi;
			System.out.print(" ‰»Î");
			zi=input.next();	
		}while(!zi.equals("Esc"));
		System.out.println(all);
	}
}