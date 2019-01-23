import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		do{
			System.out.println("请输入一个数：");
		int num=input.nextInt();
			if(num==1){
				System.out.println("1:MON");
			}
			else if(num==2){
				System.out.println("2:TUE");
				}
			else if(num==3){
				System.out.println("3:WED");
				}
			else if(num==4){
				System.out.println("4:THU");
				}
			else if(num==5){
				System.out.println("5:FRI");
				}
			else if(num==6){
				System.out.println("6:SAT");
				}
			else if(num==7){
				System.out.println("7:SUN");
				}
			else if(num==0){
			break;
			}
			else{
				System.out.println("输入错误，请重新输入！");
				num=input.nextInt();
			}
		}while(true);
		
		}
}