import java.util.*;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=0;
		while(i<=2){
			System.out.println("请输入一个 0 到 2 之间的整数");
			int answer=input.nextInt();
			switch(answer){
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
					System.out.println("输入错误");
			}
			i++;

		}
	}
}