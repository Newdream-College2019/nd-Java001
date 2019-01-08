import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		do{
			System.out.println("请输入一个0~2的整数：");
			i=input.nextInt();
			switch(i){
				case 0:
					System.out.println("你出的是石头");
					break;
				case 1:
					System.out.println("你出的是剪刀");
					break;
				case 2:
					System.out.println("你出的是布");
					break;
				default:		
					break;
			}
		}while(i>=0&&i<=2);
}
}