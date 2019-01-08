import java.util.Scanner;
public class Test05{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean b=true;
		do{
			System.out.print("输入一个0~2之间的整数：");
			int i=in.nextInt();
			switch(i){
				case 0:
					System.out.println("你出的是石头");break;
				case 1:
					System.out.println("你出的是剪刀");break;
				case 2:
					System.out.println("你出的是布");break;
				default:
					b=false;break;
			}
		}while(b);
	}
}
