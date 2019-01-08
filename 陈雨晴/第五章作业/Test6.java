import java.util.Scanner;
import java.util.Random;
public class Test6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int i,j;		
		String answer="Y";
		while("Y".equals(answer)){
			System.out.println("人机猜拳游戏");
			System.out.println("人请出拳");
			i=input.nextInt();
			System.out.println("电脑请出拳");
			j=rd.nextInt(3)+0;
			switch(i){
				case 0:
					System.out.println("人出的是石头");
							switch(j){
				                        case 0:
											System.out.println("电脑出的是石头");
											break;
										case 1:
											System.out.println("电脑出的是剪刀");
											System.out.println("人胜");
											break;
										case 2:
											System.out.println("电脑出的是布");
										    System.out.println("电脑胜");
											break;
										default:
											System.out.println("出错了");
										}
					break;
				case 1:
					System.out.println("人出的是剪刀");
											switch(j){
				                        case 0:
											System.out.println("电脑出的是石头");
											System.out.println("电脑胜");
											break;
										case 1:
											System.out.println("电脑出的是剪刀");
											break;
										case 2:
											System.out.println("电脑出的是布");
										    System.out.println("人胜");
											break;
										default:
											System.out.println("出错了");
										}
					break;
				case 2:
					System.out.println("人出的是布");
											switch(j){
				                        case 0:
											System.out.println("电脑出的是石头");
											System.out.println("人胜");
											break;
										case 1:
											System.out.println("电脑出的是剪刀");
											System.out.println("电脑胜");
											break;
										case 2:
											System.out.println("电脑出的是布");
										    
											break;
										default:
											System.out.println("出错了");									
										}
				
					break;
				default:
					System.out.println("出错了");
			}
			
			if(i==j){
				System.out.println("平局");
			}
			System.out.print("是否继续游戏？(Y/N)");
			answer=input.next();
		}
		System.out.println("游戏结束");
	}
}