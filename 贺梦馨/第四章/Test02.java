import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		System.out.println("请输入买桃的数量");
		Scanner input=new Scanner(System.in);
		int peach=input.nextInt();
		int total;
		switch(peach){
			case 1:
			total=1;
			break;
			case 2:
			total=2;
			break;
			case 3:
			
			case 4:
		
			case 5:
			total=peach+1;
			break;
			default:
			total=peach+2;
			break;
			}
		System.out.print("总共买到的桃子数量为"+total);
	}
}