import java.util.*;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i<=7){
			System.out.println("������һ����");
			int answer=input.nextInt();
			switch(answer){
				case 1:
					System.out.println("1��MON");
					break;
				case 2:
					System.out.println("2��TUE");
					break;
				case 3:
					System.out.println("3:WED");
					break;
				case 4:
					System.out.println("4:THU");
					break;
				case 5:
					System.out.println("5:FRI");
					break;
				case 6:
					System.out.println("6:SAT");
					break;
				case 7:
					System.out.println("7:SUN ");
					break;
				case 0:
					System.out.println("�������");
					System.exit(0);
			}
			i++;
		}
		
	}
}