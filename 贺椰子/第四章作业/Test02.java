import java.util.Scanner;
public class Test02
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Ҫ�򼸸��ң���");
		int tao = in.nextInt();
		switch(tao){
			case 0:
			case 1:
			case 2:
				System.out.println("����"+tao+"����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����"+(tao+1)+"����");
				break;
			default:
				System.out.println("����"+(tao+2)+"����");
		}
	}
}
