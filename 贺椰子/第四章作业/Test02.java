import java.util.Scanner;
public class Test02
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("要买几个桃？：");
		int tao = in.nextInt();
		switch(tao){
			case 0:
			case 1:
			case 2:
				System.out.println("买了"+tao+"个桃");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("买了"+(tao+1)+"个桃");
				break;
			default:
				System.out.println("买了"+(tao+2)+"个桃");
		}
	}
}
